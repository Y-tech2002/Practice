
public class Prime_num 
{
	public static String prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
		
		
			 if(n%i==0)
				 count =count+1;
		}
	if(count==2)
	 
		return "prime";
	else
		return "not";
	
	}

public static void main(String[] args) 
{
	for(int i=1;i<=100;i++)
	{
		if(Prime_num.prime(i)=="prime")
		
	     System.out.println(i);
	
	}
}
}	


		


