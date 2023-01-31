package com.shreya;

import java.util.Scanner;

public class TransposeMatrix 
{
	public static void main(String[] args)
	 {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row size");
		int r = s.nextInt();
		System.out.println("enter the column size");
		int c = s.nextInt();
		int m1[][]=new int[r][c];
		int transpose[][] = new int[r][c];
		System.out.println("enter" + r*c + "numbers in m1 matrix");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c;j++)
			{
				m1[i][j] = s.nextInt();
			}
		}
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<r; j++)
			{
				transpose[i][j] =m1[i][j];
			}
		}
		System.out.println("transpose matrix is:");
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				System.out.print(transpose[i][j] +" ");
			}
			System.out.println();
		}
}
}