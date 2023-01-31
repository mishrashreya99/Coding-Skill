package com.shreya;

import java.util.Scanner;

public class ReverseWordbyWord 
{
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
  System.out.println("enter string sentence");
  String s1= s.nextLine();
  String[]s2= s1.split(" ");
  for(int i=s2.length-1;i>=0;i--)
  {
	  System.out.print(s2[i]+" ");
  }
	}
}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	