package com.shreya;

import java.util.Scanner;

public class LinearSearch 
	{  
	public static void main(String[] args)
	{
	int flag=0 , index=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the array size");
	int size = s.nextInt();
	int num[]= new int[size];
	System.out.println("enter"+size+"numbers in array");
	for(int i=0;i<size;i++)
{
	num[i] =s.nextInt();
}
	System.out.println("enter number for searching");
	int key =s.nextInt();
	for(int i =0;i<size; i++)
	{
		if(key == num[i])
		{
			flag=1;
			index =i;
		}
	}
	if(flag==1)
	{
		System.out.println("number is found at index:"+index);
	}
	else
	{
		System.out.println("number is not found");
	}
	}
}

