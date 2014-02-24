package Assignment3;

import java.util.*;
import java.io.*;

public class A3Driver 
{

	  public static void main(String[] args) 
	  {
		// TODO Auto-generated method stub
		
		//Open file; file name specified in args (command line)
		
		//Parse input, take appropriate actions.
		
		//Stub for arraylist.
		ArrayList<Item> shoppingCart = new ArrayList<Item>(); 
		Scanner in;
		if(args.length == 1)
		{
			String fileName = args[0];
			File inputFile = new File(fileName);
			try
			{
				in = new Scanner(inputFile);
			}
			catch(Exception e)
			{
				System.out.println("Error no file found");
				return;
			}
		}
		else
		{
			System.out.println("No input found mmk");
			return;
		}
		// General code example for how to iterate an array list. You will have to modify this heavily, to suit your needs.
		Iterator<Item> i = shoppingCart.iterator();
		while(in.hasNextLine())
		{
			String nextLine = in.nextLine();
			nextLine = nextLine.toLowerCase();
			String[] input = mySplit(nextLine);
			
			int valid;
			try
			{
				valid = isValid(input);
			}
			catch(Exception e)
			{
				System.out.println("Error, invalid input");
				continue;
			}
			if(valid == 0)
			{
				System.out.println("Error, invalid input");
				continue;
			}
			if(valid == 1)
			{
				insert(input, shoppingCart);
			}
			else if(valid == 2)
			{
				search(input, shoppingCart);
			}
			else if(valid == 3)
			{
				delete(input, shoppingCart);
			}
			else if(valid == 4)
			{
				update(input, shoppingCart);
			}
			else if(valid == 5)
			{
				print(shoppingCart);
			}
			else
			{
				System.out.println("Some Error Happened");
			}
		}
		/*while (i.hasNext()) 
		{
			Item temp = i.next();
			temp.calculatePrice(); 
			temp.printItemAttributes();
			//This (above) works because of polymorphism: a determination is made at runtime, 
			//based on the inherited class type, as to which method is to be invoked. Eg: If it is an instance
			// of Grocery, it will invoke the calculatePrice () method defined in Grocery.
		}	
		*/	
	  }
	  
	  public static int isValid(String[] input)
	  {
		  int type;
		  if(input.length > 8 || input.length < 1)
		  {
			  return 0;
		  }
		  if(input[0].equals("insert"))
		  {
			  type = 1;
		  }
		  else if(input[0].equals("search") && input.length == 2)
		  {
			  type = 2;
			  return type;
		  }
		  else if(input[0].equals("delete") && input.length == 2)
		  {
			  type = 3;
			  return type;
		  }
		  else if(input[0].equals("update") && input.length == 3)
		  {
			  try
			  {
				  Integer i = Integer.valueOf(input[2]);
			  }
			  catch(Exception e)
			  {
				  return 0;
			  }
			  type = 4;
			  return type;
		  }
		  else if(input[0].equals("print") && input.length == 1)
		  {
			  type = 5;
		  }
		  else
		  {
			  return 0;
		  }
		  
		  if(type == 1 && input.length >= 6 && input.length <=8)
		  {
			  if(!input[1].equals("clothing") && !input[1].equals("groceries") 
					  && !input[1].equals("clothing"))
				{
				  	return 0;
				}
			  try
			  {
				 Double d = Double.valueOf(input[3]);
				 Integer i = Integer.valueOf(input[4]);
				 Double d2 = Double.valueOf(input[5]);
			  }
			  catch(Exception e)
			  {
				  return 0;
			  }
			  if(input[1].equals("clothing") && input.length == 6)
			  {
				  return type;
			  }
			  if(input[1].equals("electronics") && input.length == 8
					  && (input[6].equals("F") && input[6].equals("NF")))
			  {
				  return type;
			  }
			  if(input[1].equals("groceries") && input.length == 7
					  && (input[6].equals("P") || input[6].equals("NP")))
			  {
				  return type;
			  }
			  
			  return 0;
					  
		  }
		  
		  return 0;
		  
		  
	  }
	  

}
