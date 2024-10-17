import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
    int n=21;
	int d=21;
	int rem =0;
	int sum=0;
while(n!=0) 
{
	rem =n%10;
	sum = sum+rem;
	n=n/10;

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



