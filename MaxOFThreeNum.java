//           Day-2(1)            27/11/24
public class MaxOFThreeNum 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		//1st type
		if(a>b&&a>c)
		{
			System.out.println(c);
		}
		else if(b>a&&b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		//2nd type
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		//using ternary operator
		int res=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println(res);
	}
}
