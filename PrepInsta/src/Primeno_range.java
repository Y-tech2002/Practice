
public class Primeno_range {

    public static String prime(int n) {
    	{
    	    int count =0;
    	    
    	   for(int i=1;i<=n;i++)
    	   {
    		   if(n%i==0)
    		   {
    			   count=count+1;
    		   }
    	   }
    		if(count==2)
    		{
    			return "prime";
    			
    		}
    		else
    			return "no";

    	}
    }

	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++) 
		{
		if(prime(i)=="prime") 

			
				System.out.println(i);
			
		}
	}
	

}
