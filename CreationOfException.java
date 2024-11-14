class YogiException extends Exception
{
	public YogiException(String str)// constractor
	{
		super(str);
	}
}

public class CreationOfException {

	public static void main(String[] args) 
	{
		int i=20;
		int j=0;
		    
		 try 
		 {
		     j=18/i;
		     if(j==0)
		     {
		      throw new YogiException("i don't want to print zero");//object with parameter
		     }
		 }
		 
		 catch(YogiException e)
		 
		 {
			 j=18/1;
			 System.out.println(" 1 is Default output "+ e);
			 
		 }
//		 catch(Exception e) 
//		 {
//			 System.out.println("something wrong in this");
//		 }
//		 System.out.println(j);

	}

}



