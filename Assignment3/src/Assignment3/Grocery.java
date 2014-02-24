package Assignment3;

public class Grocery extends Item {
	//variables, constructor here
	protected boolean perishable;
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	Grocery()
	{
		super();
		perishable = false;
	}
	
	Grocery(String myName, double myPrice, double myWeight, int myQuantity, boolean myPerishable)
	{
		super(myName, myPrice, myWeight, myQuantity);
		perishable = myPerishable;
	}
	
	double calculatePrice()
	{
		double final_price;
		if(perishable)
		{
			final_price = price + 1.2*20*weight*quantity;
		}
		
		else
		{
			final_price = price + 20*weight*quantity;
		}
		
		return final_price;
	}
	
	void printItemAttributes () 
	{
		System.out.println("Item type is grocery, and item name is " + name);
		System.out.printf("Item price is %.2f" + price + "/n");
		System.out.printf("Item weight is %.2f" + weight + "/n");
		System.out.println("Item quantity is " + quantity);
		if(perishable)
		{
			System.out.println("This item is perishable");
		}
		else
		{
			System.out.println("This item is not perishable");
		}
		
		
		//Print all applicable attributes of this class
	}
}
