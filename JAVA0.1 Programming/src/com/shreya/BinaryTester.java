package com.shreya;

import java.util.Scanner;

public class BinaryTester
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array size");
		int size= s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter"+size+ "number in ascending order");
		for(int i=0 ;i<size;i++)
		{
			arr[i] = s.nextInt();
			
		}
		System.out.println("enter the number for search");
		int key=s.nextInt();
		int last= arr.length-1;
		BinarySearch b = new BinarySearch();
		b.BinarySearch(0, last,arr,key);
	}
		
}
