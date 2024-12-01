import java.util.*;

public class CollectionMap {

	public static void main(String[] args) {
//		List interface in java
		
//		List num=new ArrayList();
//		num.add(6);
//		num.add(9);
//		num.add("yogi");
//		System.out.println(num);
//		System.out.println(num.get(2));
//		System.out.println(num.indexOf(9));
		System.out.println("--------------------------------------------------");
		
//		Set interface In java
		
//		Set num1=new HashSet(); // this method used to print unique values
		Set num1=new TreeSet();//this method is used to sort the values
		num1.add(10);
		num1.add(300);
		num1.add(13);
		System.out.println(num1);
		System.out.println("---------------------------------------------------");
		
//		Map is not a interface int is part of Collection
		Map num2=new HashMap();
		num2.put("yogesh",82);
		num2.put("Harish",93);
		num2.put("Raj",89);
		System.out.println(num2);
		collections .sort(num2);
		
		
      
	}		

}
