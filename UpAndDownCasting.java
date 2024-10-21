
class C
{
	void show()
	{
		System.out.println("in class C");
	}
}
class D extends C
{

	void show1()
	{
		System.out.println("in class D");
	}
}


public class UpAndDownCasting 
{
	public static void main(String[] args) 
	{
		C obj= new D(); //upcasting
		obj.show();
		
		D obj1 = (D)obj; //downcasting
		obj1.show1();
	
		
	}

}
