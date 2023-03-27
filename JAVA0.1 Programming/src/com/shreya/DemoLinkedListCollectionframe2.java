package com.shreya;

import java.util.LinkedList;

public class DemoLinkedListCollectionframe2
{
	public static void main(String[] args)
	   {
		LinkedList al = new LinkedList();
		Integer n1=10;
		al.add(n1);
		Double d1 = 0.015;
		al.add(d1);
		Character c ='A';
		al.add(c);
		Boolean b = true;
		al.add(b);
		al.add("Lucknow");
		System.out.println(al);
		LinkedList al2 = new LinkedList();
		al2.add("blue");
		Integer n3 =15;
		al2.add(n3);
		Float f1 = 0.98f;
		al2.add(f1);
		Character c2 ='B';
		al2.add(c2);
		Boolean b2 =false;
		al2.add(b2);
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.containsAll(al2));
		System.out.println(al.contains(n1));
		al.removeAll(al2);
		System.out.println(al);
		al.remove("Lucknow");
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
				
	 }
}

