
class A1
{
	public A1()
	{
		System.out.println("in A1");
	}
	public A1(int n1)
	{
		System.out.println("in int A1");
	}
}

class B1 extends A1
{
	public B1()
	{ 
		super();
	  System.out.println("in B1");
	}
	public B1(int n)
	{   
		this();
		System.out.println("in int B1");
	}
	
}


public class superAndThis 
{
	public static void main(String[] args) 
	{
		B1 obj = new B1(5);
		

	}
}


