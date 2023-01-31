package com.shreya;

import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] args) 
   {
	 int num ,rem, revnum=0;
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter the number"); 
	 num=s.nextInt();
	 int num2 =num;
	 while(num != 0)
	 {
		 rem=num%10;
		 revnum = revnum * 10 +rem;
		 num=num/10;
		 
	 }
	 if(num2== revnum)
	 {
		 System.out.println("number is palindrome");
	 }
	 else
	 { 
		 System.out.println("not a palindrome");
	 }
}
}
