package com.shreya;

public class FindLargestnumber
{
  public static void main(String[] args)
  {
	int n1 =25 , n2=45, n3= 75, n4=53;
	if((n1>n2) && (n1>n3) && (n1>n4))
	{
		System.out.println(" n1 is largest");
	}
	else if((n2>n1) && (n2>n3) && (n2>n4)) 
	{
		System.out.println("n2 is largest");
	}
	else if ((n3>n1) &&(n3>n2) && (n3>n4))
	{
		System.out.println("n3 is largest");
	}
	else 
	{
		System.out.println("n4 is largest");
	}
}
}
