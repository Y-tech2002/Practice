class Aa
{     int a;
	public void show()
	{
		System.out.println("in Aa class");
	}
	

	 class Bb
	{
		public void demo()
		{
			System.out.println("in Ba class");
		}
	}
}


public class InnerClass 
{
	public static void main(String[] args) 
	{
        Aa obj=new Aa();
        obj.show();
        Aa.Bb obj2= obj.new Bb(); // we can use it when inner class defined as static Aa.Bb obj2=new Aa.Bb()
        obj2.demo();
	}

}
