package com.shreya;

public class DemoSPLIT 
{
  public static void main(String[] args) 
  {
	String s1 = " hi how are you";
	String[]s2 = s1.split(" ");
	for(String k:s2)
	{
		System.out.println(k);
	}
}
}
