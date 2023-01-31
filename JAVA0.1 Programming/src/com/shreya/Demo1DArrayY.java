package com.shreya;

import java.util.Scanner;

public class Demo1DArrayY 
{
 public static void main(String[] args) 
 {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the array size");
	int size = 	s.nextInt();
	String num[]= new String[size+1];
	System.out.println("Enter"+ size+ "city name in array");
	for(int i=0;i<size+1; i++)
	{
		num[i] =s.nextLine();
		
	}
	System.out.println("stored array values are:");
	for(int i=0; i<size+1; i++)
 		{
	 	System.out.println(num[i]);
 		}
  }
}
 
 