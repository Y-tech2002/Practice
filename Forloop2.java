//                        Day-3   28/11/24
public class Forloop2 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			System.out.println('*'+' ');
		
		}
		System.out.println("-------------------------------");
		for(int i=0;i<=10;i++)
		{
			System.out.print("*"+" ");
		}
		System.out.println("--------------------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) //Mind it
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		int k=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
        
        
	}

}
