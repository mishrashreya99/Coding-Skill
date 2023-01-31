package com.shreya;

import java.util.Scanner;

public class Demo2DArray 
{
  public static void main(String[] args)
  {
	Scanner s = new Scanner(System.in);
	System.out.println("enter row size");
	int r = s.nextInt();
	System.out.println("enter column size");
	int c = s.nextInt();
	int num[][] = new int[r][c];
	System.out.println("enter" + r*c + "numbers in 2D Array");
	for(int i=0; i<r;i++)
	{
		for(int j=0; j<r;j++)
		{
			num[i][j] =s.nextInt();
		}
	}
	System.out.println("Array values are :");
	for(int i =0;i<r;i++)
	{
		for(int j =0; j<c; j++)
		{
			System.out.print("num[i][j]");
		}
		System.out.println();
		}
	}
}

