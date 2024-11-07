interface Computer
{
	 void show();
}

 class Developer implements Computer
 {
	  public void show()
	 {
		 System.out.println("use laptop or deskstop");
	 }
 }
 
 class Laptop implements Computer
 {
 	public void show()
 	{
 		System.out.println("Write a code,compile and run,");
 	}
 }

 class CompApp
 {
	 void app(Computer lap)
	 {
		 lap.show();
	 }
 }

public class InterfaceAndImplement
{
	public static void main(String[] args) 
	{
      Developer d= new Developer();
      Laptop l=new Laptop();
      
      CompApp obj = new CompApp();
      
      obj.app(l);
      obj.app(d);
      
	}

}
