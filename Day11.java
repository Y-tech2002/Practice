
public  class Day11 {
	
	public static int reverse(int num) 
	{
		int res=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		return res;
	}
	
		public static void main(String[] args) {
	 int count=0;
	 for(int i=1; ;i++)
	 {  
		 int num=i;
		int rest=reverse(num);
		
	     if(num==rest)
	     {
	    	 System.out.println(num);
	    	count++;
	     }
	   
	     if(count==25)
	     {
	    	 System.out.println( count);
	    	break;
	     }
	     
	 }

	}
	

}
	



