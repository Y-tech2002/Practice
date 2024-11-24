package Objectpacg;
class Kgf extends Thread
{
	String producer="vijay";
	String director="prashanth nill";
	String actor="yash";
	String artist="artists";
	
	public void run()
	{
		if(getName().equals("Producer"))
		{
			producing();
		}
	
	
	 else if(getName().equals("Director"))
	{
		directing();
	}
	else if(getName().equals("Actor"))
	{
		directing();
	}
	else
	{
		artists();
	}
}

	
void producing()
{
	try {
		for(int i=0;i<=3;i++)
		{
			System.out.println(producer +" producing the movie");
		    Thread.sleep(5000);
		}
		System.out.println(producer +" producer stop producing the movie");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

void directing()
{
	try {
		for( ; ;)
		{
			System.out.println(director +" directing  the movie");
		    Thread.sleep(5000);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

void acting()
{
	try {
		for( ; ;)
		{
			System.out.println(actor +"actor the movie");
		    Thread.sleep(5000);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

void artists()
{
	try {
		for( ; ;)
		{
			System.out.println(artist +"artist acting in  the movie");
		    Thread.sleep(5000);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
public class DaemonThread {

	public static void main(String[] args) {
	 Kgf k1=new Kgf();
	 Kgf k2=new Kgf();
	 Kgf k3=new Kgf();
	 Kgf k4=new Kgf();
	 
	 k1.setName("Producer");
	 k2.setName("Director");
	 k3.setName("Actor");
	 k4.setName("Artists");
	 
	 k2.setDaemon(true);
	 k3.setDaemon(true);
	 k4.setDaemon(true);
	 
	 k1.setPriority(10);
	 k2.setPriority(9);
	 k3.setPriority(9);
	 k4.setPriority(9);
	 
	 
	 k1.start();
	 k2.start();
	 k3.start();
	 k4.start();
	 
	}
}

