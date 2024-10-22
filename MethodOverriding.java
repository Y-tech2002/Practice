package Objectpacg;

class plane1
{
	void land()
	{
		System.out.println("plane is landed");
	}
}
class Cargo extends plane1
{
	void land()
	{
		System.out.println("cargo plane landed");
	}
}
class Passanger extends plane1
{
	void land()
	{
		System.out.println("passanger plane landed");
	}
}
class Fight extends plane1
{
	void land()
	{
		System.out.println("fighter plane landed");
	}
}

class Airport
{
	void allowPlane(plane1 ref)
	{
		ref.land();
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
       Cargo c=new Cargo();
       Passanger p=new Passanger();
       Fight f=new Fight();
       
       Airport a=new Airport();
       a.allowPlane(c);
       a.allowPlane(p);
       a.allowPlane(f);
       
       
	}

}
