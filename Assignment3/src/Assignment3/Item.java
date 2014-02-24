package Assignment3;

public class Item 
{
//Declare variables for this class. Think about its type: public, protected or private?
	protected String name;
	protected double price;
	protected double weight;
	protected int quantity;
// You will need a constructor (Why?). Create it here.
	Item()
	{
		name = "0";
		price = 0;
		weight = 0;
		quantity = 0;
	}
	
	Item(String myName, double myPrice, double myWeight, int myQuantity)
	{
		price = myPrice;
		name = myName;
		weight = myWeight;
		quantity = myQuantity;
	}
	
	double calculatePrice() 
	{
		double final_price = price + 20*weight*quantity;
		// Insert price calculation here
		return final_price;
	}
	

	void printItemAttributes () 
	{
		System.out.println("Item type is item, and item name is " + name);
		System.out.printf("Item price is %.2f" + price + "/n");
		System.out.printf("Item weight is %.2f" + weight + "/n");
		System.out.println("Item quantity is " + quantity);
		
		
		//Print all applicable attributes of this class
	}

}
