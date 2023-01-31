package com.shreya;

import java.util.Scanner;

public class Demo1DArray4
{
	  public static void main(String[] args) 
	   {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the array size");
		 int size = s.nextInt();
		 String name[] = new String[size+1];
		 System.out.println("enter the weeks days"+size+"name in array");
		 for(int i =0;i<size+1;i++)
		 {
			 name[i]= s.nextLine();
			 
		 }
		 System.out.println("stored values in array are :");
		 for(int i=0; i<size+1; i++)
		 {
			 System.out.println(name[i]);		 
		 }
	   }
}
