package meth;

class Bank
{
	float getRate()
	{
		return 0.2f;
		
	}
}

class SBI extends Bank
{   @Override
	float getRate()
	{
		return 5.2f;
		
	}
}
class ICIC extends Bank
{    @Override
	float getRate()
	{
		return 7.5f;
		
	}
}



public class RuntimePolymorphism 
{

	public static void main(String[] args) 
	{	Bank b = new Bank();
	
	System.out.println("interest is :"+   "  "  +b.getRate());
	b= new SBI();
	System.out.println("interest is :"+ b.getRate());
	b= new ICIC();
	System.out.println("interest is :"+ b.getRate());

	}

}
