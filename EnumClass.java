enum laptop
{
	Macbook(2000),xps(2200),surface,thikpad(1800);

	private int price;
	
	private laptop()
	{
		this.price=500;
	}
	
	private laptop(int price) 
	{
		this.price = price;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}	
}

public class EnumClass {

	public static void main(String[] args) 
	{
//	  laptop lap= laptop.Macbook; //single value with single laptop
//	  System.out.println(lap+":"+lap.getPrice());
	  
	  for(laptop lap:laptop.values()) //all laptops with values
	  {
		  System.out.println(lap+":"+lap.getPrice());
	  }
	  
	}

}
