package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class arraylistprg {

	public static void main(String[] args) {
		//Add elements to arraylist dynamically
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(11);
		al.add(34);
		al.add(44);
		al.add(21);
		al.add(45);
		
		System.out.println(al);
		//Add elements at particular index
		al.add(2,29);
		
		System.out.println(al);
		//Add all the elements from one array list to another array list
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(56);
		al1.add(34);
		al1.add(45);
		al1.add(56);
		al1.add(34);
		al1.add(45);
		al1.add(56);
		
		al1.addAll(al);
		System.out.println(al1);
		//Java ArrayList Program based on Remove, Get, Contains, and Set methods
		al.remove(4);
		System.out.println("After removal of index 4th position value:" + al);
		Integer it=al.get(4);
		System.out.println(it);
		Boolean bl=al1.contains(116);
		System.out.println(bl);
		al1.set(3, 70);
		System.out.println(al1.get(3));
		//Iteration ArrayList Program using Iterator, ListIterator, Enumeration, & Enhanced for loop
		//Iterator
		//iterator<Integer> itr=list.iterator();
//		Iterator<Integer> itr=al1.iterator();
//		while(itr.hasNext())
//		{
//			Integer il=itr.next();
//			System.out.println(il);
//		}
		ListIterator<Integer> litr=al1.listIterator();
		while(litr.hasNext())
		{
			Integer lil=litr.next();
			System.out.println("List iterator" + lil);
		}
		
		
	}
}
