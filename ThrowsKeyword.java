class Aa
{
	public void show() throws ClassNotFoundException
	{
		try
		{
			Class.forName("Cal");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("not able to find class "+e);
		}
	}
}

public class ThrowsKeyword 
{
	public static void main(String[] args) 
	{
		Aa obj=new Aa();
		
		try 
		{
			obj.show();
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	
	}

}
