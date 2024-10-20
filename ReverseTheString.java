package prepinstaStrings;

public class ReverseTheString
{
	public static void main(String[] args) 
	{
      String s = "prepinsta";
      StringBuffer sb = new StringBuffer(s);
      String rev = "";
      
//      rev =sb.reverse().toString();//other method
//      System.out.println(rev);
      
      for(int i=0;i<sb.length();i++)
      {
    	  rev= sb.charAt(i)+rev;
      }
	System.out.println(rev);
	}

}
