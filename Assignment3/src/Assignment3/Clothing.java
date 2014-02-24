package Assignment3;

public class Clothing extends Item 
{

	// variables, constructors as necessary
	
	
	
	void printItemAttributes () 
	{
		System.out.println("Item type is clothing, and item name is " + name);
		System.out.printf("Item price is %.2f" + price + "/n");
		System.out.printf("Item weight is %.2f" + weight + "/n");
		System.out.println("Item quantity is " + quantity);
		//Print all applicable attributes of this sub-class
	}
	

}
