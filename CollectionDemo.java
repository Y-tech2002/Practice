package com.arr;
import java.util .*;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList a=new ArrayList();
		Collections.addAll(a, 10,20,30,40,300,999);
		System.out.println(a);
		
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
		
		System.out.println(Collections.frequency(a, 10));
		Collections.replaceAll(a,10,999);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		Collections.swap(a, 1, 2);
		
		
		

	}

}
