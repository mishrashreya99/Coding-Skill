package com.shreya;

import java.util.Scanner;

public class PalindromeString111
{
  public static void main(String[] args) 
  {
	  String revstr="";
	Scanner s=new Scanner(System.in);
	System.out.println("enter string sentence");
	String s1= s.nextLine();
	for(int i= s1.length()-1; i>=0;i--)
	{
		revstr = revstr + s1.charAt(i);
		
	}
	if(s1.equals(revstr))
	{
		System.out.println("string is a palindrome");
	}
	else
	{
		System.out.println("string is not a palindrome");
	}
}
}
