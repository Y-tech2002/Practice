
public class Day5 {

	public static void main(String[] args) {
		System.out.println(2%5);
		int rows1=5;
		int k=1;
		for(int i=1;i<=rows1;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				
				
			if(k%2==0)
			{
				System.out.print(0+" ");
			}
			else
			{
				System.out.print(1+" ");
			}
			k++;
		 }
			System.out.println();
		}
		System.out.println("----------------------------------");
		int rows2=5;
		int sum=0;
		int temp=0;
		
		for(int i=1;i<=rows2;i++)
		{
		    sum=sum+i;
		   temp=sum;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" "); //k%5
				temp--;
			}
			System.out.println();
			
		}
		System.out.println("------------------------------------");
		
		int rows3=5;
		for(int i=1;i<=rows3;i++)
			{
			    int k1=i;
				for(int j=1;j<=i;j++)
				{
					System.out.print(k1%5+" "); //k%5
			    k1++;
				}
				System.out.println();
	   }
		System.out.println("----------------------------------------------");
		
		int rows=5;
		for(int i=1;i<=rows;i++)
	   {
			for(int j=1;j<=(rows-i);j++)
			{
				System.out.print(" "+" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1;j<=(i-1);j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
	}
		
 }
}

