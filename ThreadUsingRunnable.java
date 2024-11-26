package Objectpacg;
import java.util.Scanner;
class T1 implements Runnable
{

public void run()
{
	Scanner sca = new Scanner(System.in);
	System.out.println("enter the user name");
	String str=sca.next();
	System.out.println("enter the pwd");
	int in=sca.nextInt();
	System.out.println("collect the cash");
}
}
class T2 implements Runnable
{
	
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("ABC");
				Thread.sleep(3000);
			}
		 }
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}


class T3 implements Runnable
{
	
	public void run() {
		int a,b,c;
		a=100;
		b=200;
		c=a+b;
		System.out.println(c);
	}
}
public class ThreadUsingRunnable {

	public static void main(String[] args) {
	
  T1 t1=new T1();
  Thread x=new Thread(t1);//thread constractor as inbuilt parameter we have to pass compulsarly parameters
  x.start();
  T2 t4=new T2();
  Thread Y=new Thread(t4);
  Y.start();
  T3 t3=new T3();
  Thread Z=new Thread(t3);
  Z.start();
	}

}

