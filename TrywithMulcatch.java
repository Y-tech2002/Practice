
public class TrywithMulcatch {

	public static void main(String[] args) 
	{
	  int i=2;
	  int j=0;
	  
	  int[] num= {1,2,3,4};
	  
	  try{
		   j=18/i;
		   System.out.println(num[2]);
		  	   
      }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Divided by zero");
	  }
	  
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("Array out of bound");
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println(("something is wrong"));
	  }
	  
	  System.out.println(j);
	  System.out.println("tata bye");

	}

}
