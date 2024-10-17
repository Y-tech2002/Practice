
    public  class Palindrome_range
   {
	public static  String dogs(int k)
	{
	
		int n=k;
		int n1=k;
		int rev=0;
		while(n1!=0)
		{
			int rem = n1%10;
			rev=rem+rev*10;
			n1=n1/10;	
		}
		if(n ==rev)
		{
		        return "ran";
		}
		else
	            return "fal";
	}
	
     public static void main(String[] args)
  {
	
    	 for(int i=1;i<100;i++)
    	 {
    		 if(dogs(i)=="ran" )
    		 {
    			 System.out.println(i);
    	     }
         }
    	 
  }
}