  
  interface A             //here we no need to declare abstract automaticaly implemented
{
	public abstract void show();
    void config();                //here we no need to declare public abstract automaticaly implemented
	
}

class B implements A            // here we use implements rather than extends 
{
     public void show() 
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in config");
	}
}



public class Interface
{
	public static void main(String[] args)
	{
	  A obj=new B();
	  obj.show();
	  obj.config();
	}

}






















