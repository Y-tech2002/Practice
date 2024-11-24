package Objectpacg;

class Msword1 extends Thread
{
//	String producer="vijay";
//	String director="prashanth nill";
//	String actor="yash";
//	String artist="artists";
	
	public void run()
	{
		if(getName().equals("Typing"))
		{
			typing();
		}
	
	 else if(getName().equals("SpellCheck"))
	{
		spellCheck();
	}
	else 
	{
		autoSave();
	}
}	
void typing()
{
	try {
		for(int i=1;i<=3;i++)
		{
			System.out.println("user typing the letters");
		    Thread.sleep(5000);
		}
		System.out.println("user stops typing letters");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

void spellCheck()
{
	try {
		for( ; ;)
		{
			System.out.println("msword check the spelling");
		    Thread.sleep(5000);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

void autoSave()
{
	try {
		for( ; ;)
		{
			System.out.println("msword auto save the file");
		    Thread.sleep(5000);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
 }
}

public class DaemonTyping {

	public static void main(String[] args)
	{
		 Msword1 m1=new Msword1();
		 Msword1 m2=new Msword1();
		 Msword1 m3=new Msword1();
		 
		 m1.setName("Typing");
		 m2.setName("SpellCheck");
		 m3.setName("AutoSave");
		 
		 m2.setDaemon(true);
		 m3.setDaemon(true);
		
		 m1.setPriority(9);
		 m2.setPriority(3);
		 m3.setPriority(9);
		 
		 m1.start();
		 m2.start();
		 m3.start();
	}

}

