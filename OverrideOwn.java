package Objectpacg;

class Car
{
	void start() 
	{
		System.out.println("start and ride");
	}
	void pickup()
	{
		System.out.println("100 km per sec");
	}
	
}

class Bucati extends Car
{
	@Override
	void pickup()
	{
		System.out.println("200 km per sec");
	}
}
class Lambo extends Car
{
	@Override
	void pickup()
	{
		System.out.println("150 km per sec");
	}
}
class Rollsroyce extends Car
{
	@Override
	void pickup()
	{
		System.out.println("120 km per sec");
	}
}

public class OverrideOwn 
{
	public static void main(String[] args) 
	{
		Bucati b=new Bucati();
		Lambo l=new Lambo();
		Rollsroyce r=new Rollsroyce();
		
		b.start();
		b.pickup();
		System.out.println();
		l.start();
		l.pickup();
		System.out.println();
		r.start();
		r.pickup();
		
	}

}
