
public class Palindrome {

	public static void main(String[] args) 
	{
		String name="level";
		
		
		StringBuffer sb = new StringBuffer(name);
		
            StringBuffer name2=sb.reverse();
            String rev= sb.toString();
         
            if(rev.equals(name)){
            	
            System.out.println("palindrome");
            }
            else
            	System.out.println("not palindrome");


	}

}
