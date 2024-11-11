enum Status1
{
	Running,fail,pending,success;	
}

public class EnumifAndSwitch 
{
	public static void main(String[] args) 
	{
	  Status1 s= Status1.fail;
//	  System.out.println(s.getClass().getSuperclass());to get superclass of enum
	  
	  switch(s)
	  {
	    case Running:
	    	System.out.println("All good");
	    	break;
	    	
	    case fail:
	    	System.out.println("Try again");
	    	break;
	    	
	    case pending:
	    	System.out.println("please wait");
	    	break;
	    
	    default:
	    	System.out.println("done"); // we can also implement it using if and else
	    	break;
	    
	  
//	  if(s==Status1.Running)
//	  {
//		  System.out.println("All good");
//	  }
//	  else if(s==Status1.fail)
//	  {
//		  System.out.println("Try again");
//	  }
//	  else if(s==Status1.pending)
//	  {
//		  System.out.println("please wait");
//	  }
//	  else
//	  {
//		  System.out.println("Done");
//	  }
		 
	  }
	
}

}
