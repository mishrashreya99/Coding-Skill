package com.shreya;

import java.util.Scanner;

public class DemoPALINDROMEBuilder 
{
  public static void main(String[] args) 
  {
	 Scanner s= new Scanner (System.in);
	 System.out.println("enter the string");
	 String s1 = s.nextLine();
	 String s2 =s1;
	 StringBuilder sb = new StringBuilder(s1);
	 sb.reverse();
	 if(s2.equals(sb.toString()))
	 {
		 System.out.println("string is a palindrome");
	 }
	 else
	 {
		 System.out.println("not a palindrome");
	 }
	 
}
}
