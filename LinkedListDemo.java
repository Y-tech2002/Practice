package com.arr;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

//               04/12/2024
public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList<Integer> l=new LinkedList<Integer>();
		  Collections.addAll(l,10,20,30);
		   System.out.println(l);
		   l.addFirst(200);
		   l.addLast(300);
		   System.out.println(l);

		   
		   LinkedList<Integer> l2=new LinkedList<Integer>();
		   l2.add(40);
		   l2.add(50);
		   l2.add(60);
		   l2.addAll(l);
		   System.out.println(l2); //[40, 50, 60, 10, 20, 30]
		   LinkedList<Integer> l3=new LinkedList<Integer>();
		   l3.add(40);
		   l3.add(90);
		   l3.add(60);
		   
		   System.out.println(l3.peekFirst());
		   System.out.println(l3.peekLast());

		   l3.retainAll(l2);
		   System.out.println(l3);
		   l2.addAll(l3);
		   System.out.println(l2);
		   
	}

}
