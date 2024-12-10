
public class Day8 {

	public static void main(String[] args) {
		int rows1=7;
		for(int i=1;i<=rows1;i++)
		{
			for(int j=1;j<=rows1;j++)
			{
				if(i==1||i==rows1||j==1||j==rows1||i==j||i+j==rows1+1||i==(rows1+1)/2||j==(rows1+1)/2)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
     System.out.println("--------------------------------------------------------");
		
		int rows=6;
		int cols=7;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=6;j++)
			{
			
				if((i==1 && j%3==0)||( i==0 && j%3!=0)||(i-j==2)||(i+j==8))
				{
					System.out.print("*"+" ");
				}
				else if((i==2&&j==2))
				{
					System.out.print("G"+" ");
				}
				else if(i==2&&j==3)
				{
					System.out.print("N"+" ");
				}
				else if(i==2&&j==4)
					System.out.print("Y"+" ");
				
				else if(i==2&&j==5)
					System.out.print("T"+" ");
				
				else
					
				{
					System.out.print(" "+" ");
		        }
				
		     }
			
			System.out.println();
		}
		
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<=6;j++)
			{
				if((i==1 && j%3==0)||( i==0 && j%3!=0)||(i-j==2)||(i+j==8))
				{
					System.out.print("*"+" ");
				}
				else if((i==2&&j==2))
				{
					System.out.print("1"+" ");
				}
				else if(i==2&&j==3)
				{
					System.out.print("4"+" ");
				}
				else if(i==2&&j==4)
					System.out.print("3"+" ");
				
				else	
				{
					System.out.print(" "+" ");
		        }
		     }
			
			System.out.println();
		}
	
	}

}
