
import java.util.Scanner;
public class Harshadno 

{
	public static void main(String[] args) 
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter input");
		int n=sca.nextInt();
		int d=n;
		int rem =0;
		int sum=0;
		
	while(n!=0) 
	{
		rem =n%10;
		sum = sum+rem;
		n=n/10; // you forgotten difference between slash(/) and modulus(%
	}
	if(d%sum==0)
	{
		System.out.println("It is Harshad number");
	}
	else
	{
		System.out.println("It is not a Harshad number");
	}
	
	}
}

