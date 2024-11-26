package Objectpacg;

class House implements Runnable
{
	House()
	{
		Thread t1=new Thread(this);
		Thread t2=new Thread(this);
		Thread t3=new Thread(this);
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Others");
		t1.start();
		t2.start();
		t3.start();
	}

synchronized public void run() {
	try {
		System.out.println(Thread.currentThread().getName()+" has enter the bathroom");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+" has closed the door");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+" is dressing up");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
 }
}


public class SynchronizationOfThread {

	public static void main(String[] args){ 
	
   House h= new House();
	}

}
