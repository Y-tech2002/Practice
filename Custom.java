package Objectpacg;
import java.util.*;

class underAgeException extends Exception
{
	
}
class overAgeException extends Exception
{
	
}

public class Custom {

	public static void main(String[] args) 
	{
//		System.out.println("enter the age");
		int a =19;
//		Scanner sca=new Scanner(System.in);
//		a=sca.nextInt();

		
		try {
			if(a<=18)
			{
				throw new underAgeException();
			}
			else if(a>60)
			{
				throw new overAgeException(); 
			}
			else
			{
				System.out.println("person eligible for DL");
			}
			
		}
		catch(underAgeException e)
		{
			System.out.println("under age exception solved");
		}
		catch(overAgeException e)
		{
			System.out.println("over age exception solved");
		}
	}

}
