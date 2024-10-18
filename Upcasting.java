package Objectpacg;

class plane
{
	void land()
	{
		System.out.println("plane is landing");
	}
}

class Fighter extends plane
{
	@Override
	void land()
	{
		System.out.println("Fighter plane is landed");
	}
	void missileLaunch()
	{
		System.out.println("Missile is launched");
	}
}




public class Upcasting 
{

	public static void main(String[] args)
	
	{
		Fighter f = new Fighter();
		plane ref;
		
		ref = f;
		ref.land();
		((Fighter)ref).missileLaunch();
		
		

	}

}
