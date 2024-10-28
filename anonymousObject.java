
class A
{
 int a;
  {
	  System.out.println(" in ananymous object");
  }

   void show(String n ,int a)
  {
	  System.out.println("in anonymous method "  +  a +":"+n);
  }
}

public class anonymousObject 
{
	public static void main(String[] args)
	{
	  
	   new A();
	   new A().show("yohi",53);
	   

	}

}
