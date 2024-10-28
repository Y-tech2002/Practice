package Objectpacg;

class Os
{
	Os()
	{
		System.out.println("os is installed");
	}
	void checkOs()
	{
		System.out.println("charger is still working");
	}
}
 class Charger
 {
	 String name;
	 Charger(String m)
	 {
		 System.out.println("Charger is created");
	 }
	 void getCharger()
	 {
		 System.out.println("charger is used for charging");
	 }
 }

class Mobile
{
	Os o=new Os();
	Mobile()
	{
		System.out.println("mobile is created with os installed");
	}
	void hasA(Charger ch)
	{
		System.out.println("charger acquired");
		System.out.println("charger can be used for charging");
	}
}


public class HasRelation 
{
	public static void main(String[] args) 
	{
		Mobile m =new Mobile();
		Charger c = new Charger("iphone");
		m.hasA(c);
		m.o.checkOs();
		c.getCharger();
		
//		m=null;
//		m.o.checkOs();
//		c.getCharger();
//		
	}
}

