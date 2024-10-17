import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) 
	{
		String name = "dog";
		String name1 = "dom";
		
		char[] s3=name.toCharArray();
		char[] s4=name1.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		String s5=new String(s3);
		String s6=new String(s4);
		
		System.out.println(s5);
		System.out.println(s6);
		
		if (s5.equals(s6)) {
			System.out.println("Its Anagram");
		}
		else {
			System.out.println("Its not anagram");
		}
	}

}
