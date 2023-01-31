package com.shreya;

import java.util.Scanner;

public class ReverseString 
{
  public static void main(String[] args) 
  {
	Scanner s = new Scanner (System.in);
	String revstr= " ";
	System.out.println("enter the string");
	String s1 =s.nextLine();
	for(int i= s1.length()-1; i>=0;i--)
	{
		revstr = revstr+s1.charAt(i);
		
	}
	System.out.println("reverse string is :"+revstr);
}
}
