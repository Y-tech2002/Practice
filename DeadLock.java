package Objectpacg;

class Dbprocess implements Runnable
{
	String r1="oracle";
	String r2="db2";
	String r3="informatics";
	
	public void run()
	{
		if(Thread.currentThread().getName().equals("Rama"))
		{
			rama();
		}
		else
		{
			sita();
		}
	}


  void rama()
{
	synchronized(r1)
	{
		System.out.println("rama acqire oracle");
	
	synchronized(r2)
	{
		System.out.println("rama acqire DB2");
	
	synchronized(r3)
	{
		System.out.println("rama acqire Informatics");
	}
	}
	}
}
 void sita()
 {
	 synchronized(r3)
	{
			System.out.println("sita acqire oracle");
		
		synchronized(r2)
		{
			System.out.println("sita acqire DB2");
		
		synchronized(r1)
		{
			System.out.println("sita acqire Informatics");
		}
		}
   }
	 
 }
}
public class DeadLock {

	public static void main(String[] args) 
	{
	  Dbprocess d=new Dbprocess();
	  Thread t1=new Thread(d);
	  Thread t2=new Thread(d);
	  t1.setName("Rama");
	  t2.setName("Sita");
	  t1.start();
	  t2.start();

	}

}
