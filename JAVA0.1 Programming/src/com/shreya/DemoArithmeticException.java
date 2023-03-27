package com.shreya;

import java.util.Scanner;

public class DemoArithmeticException
{
  public void div( int n, int m)
  {
	  int res;
	  try
	  {
		  res=n/m;
		  System.out.println("division result is:" + res);
	  }
	  catch(ArithmeticException e)
	  {
		  e.printStackTrace();
	  }
  }
  public static void main(String[] args)
		  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter first number");
	  int n = s.nextInt();
	  System.out.println("enter second number");
	  int m = s.nextInt();
	  DemoArithmeticException obj = new DemoArithmeticException();
	  obj.div(n, m);
	  System.out.println("program exceution completed");
		  }
}
