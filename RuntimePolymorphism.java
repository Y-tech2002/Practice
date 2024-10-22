package Objectpacg;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is  eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	void breathe()
	{
		System.out.println("Animal is breatheing");
	}
}
class Tiger1 extends Animal1
{
	void eat()
	{
		System.out.println("tiger is  eating");
	}
	void sleep()
	{
		System.out.println("tiger is sleeping");
	}
	void breathe()
	{
		System.out.println("tiger is breatheing");
	}
}
class Deer1 extends Animal1
{
	void eat()
	{
		System.out.println("Deer is  eating");
	}
	void sleep()
	{
		System.out.println("Deer is sleeping");
	}
	void breathe()
	{
		System.out.println("Deer is breatheing");
	}
}
class Monkey1 extends Animal1
{
	void eat()
	{
		System.out.println("Monkey  is  eating");
	}
	void sleep()
	{
		System.out.println("Monkey  is sleeping");
	}
	void breathe()
	{
		System.out.println("Monkey  is breatheing");
	}
}

class Forest
{
	void allowAnimal(Animal1 ref)
	{
		ref.eat();
		ref.sleep();
		ref.breathe();
	}
}


public class RuntimePolymorphism 
{
	public static void main(String[] args) 
	{
      Tiger1 t=new Tiger1();
      Deer1 d=new Deer1();
      Monkey1 m=new Monkey1();
      
      Forest f=new Forest();
      f.allowAnimal(t);
      f.allowAnimal(d);
      f.allowAnimal(m);
      
	}

}
