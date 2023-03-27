package com.shreya;

import java.util.LinkedList;

public class DemoLinkedListCollectionFrame 
{
	public static void main(String[] args)
	  {
		LinkedList<String>al= new LinkedList<String>();
		al.add("Lucknow");
		al.add("Pune");
		al.add("delhi");
		al.add("Agra");
		System.out.println(al);
		
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("blue");
		al2.add("red");
		al2.add("pink");
		al2.add("blue");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		al2.removeAll(al2);
		System.out.println(al);
		al2.remove("red");
		System.out.println(al2);
		System.out.println(al.contains("delhi"));
		System.out.println(al.containsAll(al2));
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
	} 
	  
	}

