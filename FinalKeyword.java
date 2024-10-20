package prepinstaStrings;
class A1
{
	final public void show()
	{
		System.out.println("i am yogeh");
	}
}

class B1 extends A1
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
//	public void show()
//	{
//		System.out.println("i am rock");
//	}
  }


public class FinalKeyword 
{
	public static void main(String[] args) 
	{
		 B1 obj = new B1();
		 obj.show();
		 obj.add(4,5);
	}

}
