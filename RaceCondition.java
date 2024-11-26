class P extends Thread
{	 Counter c;
		   P(Counter c)
		    {
		        this.c = c;
		    }
		   public void run()
			{ 
			
		for(int i=0;i<100;i++)
		{
		  c.increment();
		}
	
	}
}

class Q extends Thread
{
	 Counter c;

	    Q(Counter c) {
	        this.c = c;
	    }
	public void run(Counter c)
	{
		for(int i=0;i<100;i++)
		{
		    c.increment();
		}
	} 
}

class Counter
{   
	int count=0;
	public synchronized void increment()
	{
		
		count=count+1;
	}
}
public class RaceCondition {

	public static void main(String[] args) throws InterruptedException
	{   
		Counter c=new Counter();
		
		P obj1=new P(c);
		Q obj2=new Q(c);
		
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		
		
		System.out.println(c.count);

	}

}
