package Assignment3;

public class Electronics extends Item 
{

	protected boolean fragile;
	protected boolean tax;
	protected String state;
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	Electronics()
	{
		super();
		fragile = false;;
		state = "0";
		tax = false;
	}
	
	Electronics(String myName, double myPrice, double myWeight, int myQuantity, boolean myFragile, String myState)
	{
		super(myName, myPrice, myWeight, myQuantity);
		fragile = myFragile;
		myState.toUpperCase();
		state = myState;
		tax = salesTax();
	}
	
	double calculatePrice()
	{
		double final_price;
		if(tax)
		{
			price = 1.1*price;
		}
		
		if(fragile)
		{
			final_price = price + 1.2*20*weight*quantity;
		}
		
		else
		{
			final_price = price + 20*weight*quantity;
		}
		
		
		return final_price;
	}
	
	public boolean salesTax()
	{
		if(state.equals("TX") || state.equals("NM") || state.equals("VA") 
				|| state.equals("AZ") || state.equals("AK"))
		{
			tax = false;
			return false;
		}
		
		else
		{
			tax = true;
			return true;
		}
	}
	
	void printItemAttributes () 
	{
		System.out.println("Item type is electronics, and item name is " + name);
		System.out.printf("Item price is %.2f" + price + "/n");
		System.out.printf("Item weight is %.2f" + weight + "/n");
		System.out.println("Item quantity is " + quantity);
		System.out.println("State being shipped to " + state);
		if(fragile)
		{
			System.out.println("This item is fragile");
		}
		else
		{
			System.out.println("This item is not fragile");
		}
		
		
		//Print all applicable attributes of this class
	}

}
