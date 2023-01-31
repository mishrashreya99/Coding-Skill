package com.shreya;

import java.util.Scanner;

public class GenerateTable 
{
  public static void main(String[] args)
  {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number to display table");
	int option = s.nextInt();
	switch(option)
	{
	case 1 : for (int i=1; i<=10;i++)
	{
		System.out.println("1 * " +i+"="+i*1);
	}
	break;
	case 2 : for(int i=2; i<10; i++)
	{
		System.out.println("2 * " +i+"="+i*2);
	}
		break;
	case 3: for( int i=3; i<10; i++)
	{
		System.out.println("3 * " +i+"="+i*3);
	}
	break;
	case 4 : for (int i=4; i<10; i++)
	{
		System.out.println("4 * " +i+"="+i*4);
	}
	break;
	case 5 : for (int i=5 ;i<=10; i++)
	{
		System.out.println("5 * " +i+"="+i*5);
	}
	break;
	default : System.out.println("  enter number between 1 to5");
	}
		
}
}
