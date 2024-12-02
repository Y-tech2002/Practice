
public class Day6 {

	public static void main(String[] args) {
//		  int rows=5;
//			for(int i=1;i<=rows;i++)
//			{
//				for(int j=1;j<=(rows-i);j++)
//				{
//					System.out.print(" "+" ");
//				}
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print("*"+" ");
//				}
//				for(int j=1;j<=i-1;j++)
//				{
//					System.out.print("*"+" ");
//				}
//				System.out.println();
//				
//			}
//			for(int i=1;i<rows;i++)
//			{
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print(" "+" ");
//				}
//				for(int j=1;j<=(rows-i);j++)
//				{
//					System.out.print("*"+" ");
//				}
//				for(int j=1;j<=(rows-1-i);j++)
//				{
//					System.out.print("*"+" ");
//				}
//				System.out.println();
//			}
//			
//			int rows=5;
//			for(int i=1;i<=rows;i++)
//			{
//				for(int j=1;j<=(rows-i);j++)
//				{
//					System.out.print(" "+" ");
//				}
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print( j+" ");
//				}
//				for(int j=(i-1);j>=1;j--)
//				{
//					System.out.print(j+" ");
//				}
//				System.out.println();
//				
//			}
//			for(int i=1;i<rows;i++)
//			{
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print(" "+" ");
//				}
//				for(int j=1;j<=(rows-i);j++)
//				{
//					System.out.print(j+" ");
//				}
//				
//				for(int j=(rows-1-i);j>=1;j--)
//				{
//					System.out.print(j+" ");
//				}
//				System.out.println();
//			}
			int rows=5;
			for(int i=1;i<=rows;i++)
			{
				for(int j=1;j<=(rows-i);j++)
				{
					System.out.print(" "+" ");
				}
				for(int j=rows;j>=(rows+1-i);j--)
				{
					System.out.print(j +" ");
				}
				for(int j=(rows+2-i);j<=rows;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			for(int i=1;i<rows;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" "+" ");
				}
				for(int j=rows;j>=(i+1);j--)
				{
					System.out.print(j+" ");
				}
				for(int j=(i+2);j<=rows;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}

}
