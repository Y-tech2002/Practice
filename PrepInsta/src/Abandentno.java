
public class Abandentno 
{
	public static void main(String[] args) 
	{
	 int n=18;
	 int sum=0;
	 
	 for(int i=1;i<18;i++)
	 {
		 if(n%i==0) 
		 {
			 sum=sum+i;
			 System.out.println(sum);
		 }
	 }
	 
	 if(sum>n)
	 {
		 System.out.println("The given number is abundent");
	 }
	 else
	 {
		 System.out.println("The given number is abundent");
	 }
	 }

}
