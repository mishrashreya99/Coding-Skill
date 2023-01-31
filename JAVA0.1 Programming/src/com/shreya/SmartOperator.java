package com.shreya;

public class SmartOperator 
{
 public static void main(String[] args) 
 {
	int n1 =25, n2=75, n3=45;
	 if((n1>n2) && (n1>n3))
	 {
		 System.out.println("n1 is largest");
	 }
	 else if ((n2>n1) && (n2>n3))
	 {
		 System.out.println("n2 is largest");
	 }
	 else 
	 {
		 System.out.println("n3 is largest");
	 }
}
}
