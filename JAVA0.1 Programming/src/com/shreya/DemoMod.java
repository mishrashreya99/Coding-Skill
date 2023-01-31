package com.shreya;

import java.util.Scanner;

public class DemoMod 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter first number");
		int n1 = s.nextInt();
		System.out.println("Enter second number");
		int n2 = s.nextInt();
		int rem = n1%n2;
		System.out.println("Mod value is : " + rem);
	}
}