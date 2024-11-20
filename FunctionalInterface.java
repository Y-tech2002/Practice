interface A4
{
	void show();
}

//class B4 implements A4
//{
//	 public void show()
//	{
//		System.out.println("in show");
//	}
//}

public class FunctionalInterface 
{
	public static void main(String[] args)
	{
//		       B4 obj = new B4();
		       A4 obj=new A4()
				{
					public void show()
					{
						System.out.println("inshow");
					}
				};
				obj.show();

	}

}
