package com.shreya;

import java.util.Scanner;

public class DemoSwitchstatement 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the option number");
		int option = s.nextInt();
			switch(option)
			{
			case 1: System.out.println("case1 running");
			break;
			case 2 : System.out.println("case2 running");
			break;
			case 3 : System.out.println("case3 running");
			break;
			default: System.out.println("default case");
				
			}
			
	}
}
