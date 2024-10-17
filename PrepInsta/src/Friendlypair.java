import java.util.Scanner;
public class Friendlypair 
{
   public static void main(String[] args)
   {
	   Scanner sca = new Scanner(System.in);
	   System.out.println("enter input one");
	   int n1=sca.nextInt();
	   System.out.println("enter input two");
	   int n2=sca.nextInt();
//	   int n1=6;
//	   int n2=28;
	   int sum1=0;
	   int sum2=0;
	   for(int i=1;i<n1;i++)
	   {
		   if(n1%i==0)
		   {
			   sum1=sum1+i;
		   }
	   }
	    for(int j=1;j<n2;j++)
	    {
	    	if(n2%j==0)
	    	{
	    		sum2=sum2+j;
	    	}
	    }
      if((float)sum1/n1 ==(float)sum2/n2) // two get accurate or decimal values we have to use float
      {
    	  System.out.println("Friendly pair");  
      }
      else
      {
    	 System.out.println("Not a friendly pair"); 
      }
   }
}
