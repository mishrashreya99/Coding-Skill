package com.shreya;

import java.util.Scanner;

public class SimpleInterest1
{
	public static void main(String[] args) 
	{
		int p,r,t;
		float si;
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle amount ");
		p=s.nextInt();
		System.out.println("enter the rate ");
		r=s.nextInt();
		System.out.println("enter the time");
		t=s.nextInt();
		si=p*r*t/100;
		System.out.println("si= "+si);
	}

}
