package com.shreya;

import java.util.Scanner;


public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		int principal, rate, time;
		float totalSI;
		Scanner s = new Scanner ("System.in");
		System.out.println("Enter principal of SI");
		principal= s.nextInt();
		System.out.println("Enter rate of SI");
		rate= s.nextInt();
		System.out.println("Enter time of SI");
		time=s.nextInt();
		totalSI = principal*rate*time/100;
		System.out.println("Calculate principal, rate, time"+totalSI);	
	}
}
