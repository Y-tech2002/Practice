
public class Day10 {
	
	public static int fac_num(int num) {
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			   count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		for(int i=1;i<=10000;i++)
		{
			int num=i;
			int res = fac_num(num);
			
			if(res==2)
			{
			System.out.println(num);
			
			}
	
	   }
		
//
//		int num=24;
//				for(int i=1;i<=num;i++)
//				{
//					if(num%i==0)
//					{
//					 System.out.println(i);
//					}
//				}
//				System.out.println("------------------------------------------------");
//				
//				for(int i=1;i<=num/2;i++)
//				{
//					if(num%i==0)
//					{
//					 System.out.println(i);
//					}
//				}
//				
//				System.out.println(num);
//				System.out.println("-----------------------------------------------------");
//				
//				for(int i=1;i<=num;i++)
//				{
//					if(num%i==0)
//					{
//					 System.out.println(i);
//					}
//				}
//				
//				System.out.println(num);
		
		
//
//public  class Day11 {
//	
//	public static int reverse(int num)
//	{
//		
//	
//	int res=0;
//    while(num!=0)
//  {
//	int rem=num%10;
//	res=(res*10)+rem;
//	num=num/10;
//  }
//    return res;
//}
//	public static void main(String[] args) 
//	{
//		int num=18;
//		int re=reverse(num);
//		if(num==re)
//		{
//			System.out.println("palindrome");
//		}
//		else
//			
//			System.out.println("not palindrome");
//		
//	}
//	
//
//}

//public  class Day11 {
//	
//	public static int reverse(int num)
//	{
//		
//	
//	int res=0;
//    while(num!=0)
//  {
//	int rem=num%10;
//	res=(res*10)+rem;
//	num=num/10;
//  }
//    return res;
//}
//	public static void main(String[] args) 
//	{
//		for(int i=1;i<=100;i++)
//		{
//			int num=i;
//			int res=reverse(num);
//			if(num==res)
//			{
//				System.out.println(num);
//			}
//		}	
//	}
//
//}
	
  }
}