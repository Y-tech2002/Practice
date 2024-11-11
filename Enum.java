enum Status
{
  Running,fail,pending,pass;
  
}


public class Enum 
{
	public static void main(String[] args) 
	{
	  Status sc=Status.Running;
	  System.out.println(sc); //it will print status 
	  System.out.println(sc.ordinal()); // it will print position of status
     System.out.println();
	  
	  Status [] ss=Status.values(); //to print all values at a time
	  for(Status s : ss)
	  {
		  System.out.println(s);
	  }
	}

}
