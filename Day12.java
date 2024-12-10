
public class Day12 {
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			int rem=0;
			num=num/10;
			count++;
		}
		return count;
	}
	public static int armstrong(int num)
	{
		int count=count(num);
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=(int)Math.pow(rem, count)+res;
			num=num/10;
		}
		return res;
	}
	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=1000000;i++)
		{
		int num=i;
		int res=armstrong(num);
		if(res==num)
		{
			System.out.println(num);
			count++;
		}
	}
		System.out.println(count);
		
 }

}
