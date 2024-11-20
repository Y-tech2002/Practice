package Objectpacg;

public class Finaly 
{
	public static void main(String[] args) {
	{
		System.out.println("iside main");
	}
	try {
		System.out.println("inside try");
		int a[]=new int[999999999];
	}
	catch(Exception e)
	{
		System.out.println("inside catch");
	}
	finally
	{
		System.out.println("inside final block");
	}

}
}