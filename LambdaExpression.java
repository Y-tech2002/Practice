interface A5
{
	void show(int i);
}

public class LambdaExpression {

	public static void main(String[] args)
	{              //Ananymous class
      A5 obj= (int i)-> System.out.println("in show lambda expression :"+ i);
	  
      obj.show(5); // lambda expession used only for functional interfaces because it only one method
	
	}

}
