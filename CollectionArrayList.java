import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionArrayList 
{

	public static void main(String[] args) 
	{
//		List<Integer> num=new ArrayList<Integer>();
		Collection<Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		System.out.println(num);
		
//		System.out.println(num.indexOf(20));// these methods present in List interface
//		System.out.println(num.get(3));
		
		for(int n:num) //in enhanced for loop use int data type if we mention data type in object other wise use Object type
		{
			System.out.println(n);
		}
	  
	}

}
