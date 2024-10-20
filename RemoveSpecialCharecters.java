package prepinstaStrings;

public class RemoveSpecialCharecters {

	public static void main(String[] args) {
		 String s = "Prep   ins t   a";
		 
	     s=s.replaceAll("[ ]","");
	     System.out.println(s);

	}

}
