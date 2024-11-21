class X extends Thread
{
	 public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("hi");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Y extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("hello");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class multipleThread
{
	public static void main(String[] args) 
	{
       X obj1=new X();
       Y obj2=new Y();
       obj1.start();
       obj2.start();
       
	}

}
