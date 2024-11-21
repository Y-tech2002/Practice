package Objectpacg;
import java.util.*;


class Task1 extends Thread{
	public void run()
	{
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the user name");
		String str=sca.next();
		System.out.println("enter the pwd");
		int pwd=sca.nextInt();
		System.out.println("collect ur cash");
	}
}
class Task2 extends Thread
{
	public void run()
	{
		try {
			
		for(int i=0;i<=10;i++)
		{
			System.out.println("hi");
			Thread.sleep(5);
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Task3 extends Thread
{
	public void run()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
}
public class MultiThread {

	public static void main(String[] args) 
	{
	 Task1 t1=new Task1();
	 Task2 t2=new Task2();
	 Task3 t3=new Task3();
	 t1.start();
	 t2.start();
	 t3.start();
	}

}
