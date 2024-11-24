 class M implements Runnable
{
	 public void run()
	{
		for(int i=1;i<=10;i++)
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
class N implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)   
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

public class ThreadPriorityAndSleep {

	public static void main(String[] args) 
	{
		{
		       M obj1=new M();
		       N obj2=new N();
		       Thread t1=new Thread(obj1);
		       Thread t2=new Thread(obj2);
		       
		       t1.start();
		       t2.start();
		       
			}
	}

}
