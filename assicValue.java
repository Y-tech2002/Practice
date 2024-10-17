package prepinstaStrings;
import java.util.Scanner;


public class assicValue {
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the charecter");
		char cha = sca.next().charAt(0);
		int val = cha;
		System.out.println("Assic value of ch is: "+ val);	
	}
}
