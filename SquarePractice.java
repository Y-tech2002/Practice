
public class SquarePractice {

	public static void main(String[] args){
		int rows=6;
		int cols=7;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i==1&&j%3==0||i==2&&j==0||i==2&&j==6)
				{
					System.out.print("*"+" ");
				}
					
				else
				{
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		
		}

	}

}
