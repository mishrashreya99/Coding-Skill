package com.shreya;

import java.util.Scanner;

public class Shreyysi
{
	public static void main(String[] args) 
	{
		int principal,rate,time;
		float si;
		Scanner s=new Scanner(System.in);
		System.out.println("enetr principal");
		principal=s.nextInt();
		System.out.println("enter rate");
		rate=s.nextInt();
		System.out.println("enter time");
		time=s.nextInt();
		System.out.println("rate= "+rate +"time= "+time +"principal = "+principal);
		si=principal*rate*time/100;
		System.out.println("si ="+si);
	}
}
