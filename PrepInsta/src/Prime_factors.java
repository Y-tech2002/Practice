
//public class Prime_factors 
//{
//
//	public static void main(String[] args)
//	{
//	   int num = 10;
//	   int count=0;
//	   for(int i=1;i<=num;i++)
//	   {
//		   if(num%i==0)
//			
//		   {
//			   System.out.println(i);
//		   }
//	   
//	   if(i)
//	   }
//	   
//	String s1="i love sunny leone hot videos";
//	
//	String s2="";
//	
//	for (int i=1;i<s1.length();i++) {
//		if ((s1.charAt(i))==' ')
//		{
//			s2=s2+" ";
//			s2=s2+Character.toUpperCase(s1.charAt(i+1));
//			i=i+1;
//			
//			
//		}
//		else {
//		
//			s2=s2+s1.charAt(i);
//			
//		}
//		
//	}
//	System.out.println(Character.toUpperCase(s1.charAt(0))+s2);
//		
//		
//	}
//
//}

public class Prime_factors{
	
	public static Boolean prime(int n) {
		int c=0;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int n=12;
		for (int i=2;i<=n;i++) 
		{
			if (n%i==0 && prime(i)==true) 
			{
				System.out.println(i);
				
			}
		}
	}
}
  



