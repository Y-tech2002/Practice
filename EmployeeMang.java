package project1;
class Employee
{
   static private int empgen=100;
	private int eid;
	private String name;
	private int age;
	private double salary;
	 
	Employee(String n)
	{
		eid=empgen;
		name=n;
	}
	
	public void setage(int a)
	{
		age=a;
	}
	
	public int getage()
	{
		return age;
	}
	public void setsalary(double s)
	{
		salary=s;
	}
	
	public double getsalary()
	{
		return salary;
	}
	
	public void displayinfo()
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+name);
	    System.out.println("employee age :" +age);
		System.out.println("employee salary:"+salary);
		
	}
	
}


public class EmployeeMang 
{

	public static void main(String[] args) 
	{
	 Employee obj=new Employee("yogi");
	 
	 obj.setage(23);
	 obj.setsalary(10000.1);
	 
     obj.displayinfo();

	}
}
