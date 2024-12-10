package com.arr;
import java.util.*;

//                05-12-2024

//TreeSet t=new TreeSet();
//Collections.addAll(t,25,35,40,50,60,10,5);
//
////System.out.println(t.lower(65));
////System.out.println(t.floor(45));
//
//System.out.println(t.higher(39));
//System.out.println(t.ceiling(20));
//System.out.println(t.floor(40));
//System.out.println(t.lower(30));
//System.out.println(t.headSet(40));
//System.out.println(t.tailSet(50));
//System.out.println(t.subSet(35,60));
// --------------------------------------------------------------------------------------
class Employee implements Comparable
{
	String name;
	int age;
	
	 Employee(String name,int age)
	{
		this.name=name;
		this.age=age;	
	}
	
	public int compareTo( Object obj)
	{
		Employee temp;
		temp = (Employee)obj;
		
		if(this.age==temp.age)
		{
			return 0;
		}

		else if(this.age>temp.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {

		Employee e1=new Employee("rama",20);
		Employee e2=new Employee("abhi",22);
		
		int res;
		res=e1.compareTo(e2);
		
		if(res==0) {
			System.out.println("ages are equal");
		}
		
		else if(res>0) {
			System.out.println("age 1 greater than age 2");
		}
		
		else if(res<0) {
			System.out.println("age 1 less than age 2");
		}
	}

}
