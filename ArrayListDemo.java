package com.arr;
import java.util.*;


class Employ
{
	String name;
	int age;


 Employ(String name,int age)
{
	this.name=name;
	this.age =age;
	
}
public String toString()
{
	return name +" "+age;
	
}

}
public class ArrayListDemo {
	public static void main(String[] args) {

		Employ e1=new Employ("rama",20);
		Employ e2=new Employ("roy",30);
		Employ e3=new Employ("bro",34);
		
	//	System.out.println(e1);
		
		HashSet h=new HashSet();
		h.add(e1);
		h.add(e2);
		h.add(e3);
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
		
//		for(int i=1;i<=h.size();i++)
//		{
//			System.out.println(h);
//		}
		
		
		
		
		
//		ArrayList a = new ArrayList();
//		Collections.addAll(a, 10, 20, 30, 40, 50);
//		
//		ListIterator litr = a.listIterator();
//		while(litr.hasNext()==true)
//		{
//			System.out.println(litr.next());
//		}
//		System.out.println("-----------------------------------------------------");
//		
//		ArrayList v = new ArrayList();
//		Collections.addAll(v, 10, 20, 30, 40, 50);
//		
//		ListIterator litr = v.listIterator(3);
//		while(litr.hasPrevious()==true)     
//		{
//			System.out.println(litr.previous()); //30,20,10
//		}
//		System.out.println("----------------------------------------------------");
//		
//		ArrayList a1=new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		System.out.println(a1);
//		System.out.println("---------------------------------------------------------");
//		
//		ArrayList a2 = new ArrayList();
//		a2.add(70);
//		a2.add(80);
//		a2.add(90);
//		System.out.println(a2);   //[70, 80, 80]
//	
//		System.out.println(a2.indexOf(30)); //-1 if the element not in list it will give -1
//		System.out.println(a2.indexOf(90));  //1
//		
//	System.out.println(a2.getFirst());
//	System.out.println(a2.getLast());
//	System.out.println(a2.remove(1));
//	 a2.add(1,2);
//	 System.out.println(a2);
//	 a2.addAll(a1);
//	 System.out.println(a2);
//	 a2.clear();
//	 System.out.println(a2);
	
		
		
 
  
	}

}
