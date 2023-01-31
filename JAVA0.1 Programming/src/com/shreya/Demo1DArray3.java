package com.shreya;

import java.util.Scanner;

public class Demo1DArray3
{
	  public static void main(String[] args) 
	   {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the array size");
		 int size = s.nextInt();
		 float num[] = new float[size];
		 System.out.println("enter"+size+"numbers in array");
		 for(int i =0;i<size;i++)
		 {
			 num[i]= s.nextFloat();
			  
		 }
		 System.out.println("stored values in array are :");
		 for(int i=0; i<size; i++)
		 {
			 System.out.println(num[i]);		 
		 }
	   }
	  }
