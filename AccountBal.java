package Objectpacg;
import java.util.*;

class negativeBalanceException extends Exception
{
	public String getMessage() 
	{
		return "ur fool u entered negative number";
	}
}
class insufficientBalanceException extends Exception
{
	public String getMessage() 
	{
		return "ur  a bigger fool u entered negative number";
	}
}

public class AccountBal {

	public static void main(String[] args)
	{
		System.out.println("enter withdrable amt");
		int amt=0;
		int balance=5000;
		balance=balance+amt;
		Scanner sca=new Scanner(System.in);
		amt=sca.nextInt();
		try {
			if(amt<0)
			{
				throw new negativeBalanceException();
			}
			
			else if(amt>balance)
			{
				throw new insufficientBalanceException(); 
				
			}
			else
			{ 
				balance=balance-amt;
				System.out.println("amount with draw sucessfully: "+":"+ "balance is " + balance );
			}
			
		}
		catch(negativeBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		catch(insufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
