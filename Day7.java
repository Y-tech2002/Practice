
public class Day7 {

	public static void main(String[] args) {
//		int rows=5;
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=(rows-i);j++)
//			{
//				System.out.print(" "+" ");
//			}
//			for(int j=i;j>=1;j--)
//			{
//				System.out.print(j +" ");
//			}
//			for(int j=2;j<=i;j++)
//					
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" "+" ");
//			}
//			for(int j=rows-i;j>=1;j--)
//			{
//				System.out.print(j+" ");
//			}
//			for(int j=2;j<=rows-i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		int rows=5;
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=rows-i;j++)
		{
			System.out.print(" "+" ");
		}
		for(int j=(rows+1-i);j<=rows; j++)
		{
			System.out.print(j+" ");
		}
		for(int j=rows-1;j>=(rows+1-i); j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
		
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
		for(int j=(rows+1-i);j<=rows; j++)
		{
			System.out.print(j+" ");
		}
		for(int j=rows-1;j>=(rows+1-i); j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
		
//		int rows=5;
		
	    for(int i=1;i<=5;i++) 
	    {
	    	for(int j=1;j<=rows-i;j++)
	    	{
	    		System.out.print(" "+" ");
	    	}
	    	for(int j=(rows+1-i);j<=5;j++)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	for(int j=4;j>=(rows+1-i);j--) 
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	       
	}
}
