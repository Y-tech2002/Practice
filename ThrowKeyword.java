
public class ThrowKeyword { 
	public static void main(String[] args) 
	{
	 int i=20;
	 int j=0;
	    
	 try 
	 {
	     j=18/i;
	     
	     if(j==0)
	     {
	      throw new ArithmeticException("i don't want zero");
	     }
	 }
	 
	 catch(ArithmeticException e)
	 
	 {
		 j=18/1;
		 System.out.println("Default output "+ e);
		 
	 }
	 catch(Exception e) 
	 {
		 System.out.println("something wrong in this");
	 }
	 System.out.println(j);
	 
	}

}
