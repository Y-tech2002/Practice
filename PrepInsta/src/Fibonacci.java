
public class Fibonacci {

	public static void main(String[] args) {
		
		
		int a=0;int b=1;
		
		System.out.print(a +","+b);
		int num = 5;
		int nextTerm = 0;
		
		for (int i=2;i<num;i++)
		{
	      nextTerm = a + b;
	      a = b;
	          b = nextTerm;
	          System.out.print ( ","+ nextTerm );
		}

}
}