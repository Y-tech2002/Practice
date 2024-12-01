package Objectpacg;
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("--------------------------------------------------");
		v.add(1);
		v.add(3);
		v.add(89);
		v.add(15);
		v.add(16);
		System.out.println(v);
		System.out.println("----------------------------------------------------");
		v.add(1);
		v.add(3.4);
		v.add("rama");
		v.add(true);
		v.add("x");
		System.out.println(v);
		System.out.println("---------------------------------------------------");
		
		v.add(40);
		v.add(50);
		v.add(60);
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("----------------------------------");
		
		Iterator itr=v.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		
		ListIterator litr=v.listIterator();
		
		  while(litr.hasNext()==true)
		  {
			  System.out.println(litr.next());
		  }  
	}
}
