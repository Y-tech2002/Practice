
 abstract class  Car
{
	public abstract void drive();
	public void PlayMusic()
	{
		System.out.println("music is playing");
	}
	
}
 class WagonR extends Car
{
	public void drive()
	{
		System.out.println("driving a car");
	}
}


public class AbstractKeyWord 
{
	public static void main(String[] args) 
	{
	 WagonR obj=new WagonR();
	 obj.drive();
	 obj.PlayMusic();
	 
	}

}
