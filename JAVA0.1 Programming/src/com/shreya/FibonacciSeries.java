package com.shreya;

import java.util.Scanner;

public class FibonacciSeries 
{
   public static void main(String[] args)
   {
	int term,a=0,b=1,fib=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of term to print fibonacci series");
	term=s.nextInt();
	System.out.println("fibonacci series are :");
	System.out.println(a);
	System.out.println(b);
	for(int i =3; i<=term;i++)
	{
		fib=a+b;
		System.out.println(fib);
		a=b;
		b=fib;
	}
   }
}
