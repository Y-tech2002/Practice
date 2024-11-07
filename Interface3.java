interface A1
{
	 void show();
	 void config();
	 
}
interface A2
{
	void add();	
}

interface A3 extends A2
{
	
}

class B1 implements A1,A2
{
	public void show()
	{
		System.out.println("in show method ");
	}
	 public void config()
	{
		System.out.println("in config method ");
	}
	 public void add()
	 {
		 System.out.println("in add method");
	 }
}


public class Interface3 
{
	public static void main(String[] args) 
	{
	   B1 obj= new B1();
	   obj.show();
	   obj.config();
	   obj.add();
	}

}
