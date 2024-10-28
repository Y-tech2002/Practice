package Objectpacg;
class Brain
{
	Brain()
	{
		System.out.println("brain is created");
	}
	void checkBrain()
	{
		System.out.println("Brain is still working");
	}
	
}
class Heart
{
	Heart()
	{
		System.out.println("heart is created");
	}
	void checkHeart()
	{
		System.out.println("heart is still working");
	}
	
}

class Mobile1
{
	Mobile1()
	{
		System.out.println("Mobile is created");
	}
	void checkMobile()
	{
		System.out.println("mobile is still working");
	}
}

class Person
{
	Brain b= new Brain();
	Heart h=new Heart();
	
	Person()
	{
		System.out.println("person created with brain and heart");
	}
	void has(Mobile1 m)
	{
		System.out.println("person can use mobile for various region");
	}
	
}

public class HasA 
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		Mobile1 m=new Mobile1();
		p.has(m);
		p.b.checkBrain();
		p.h.checkHeart();
		m.checkMobile();
		
		

	}

}
