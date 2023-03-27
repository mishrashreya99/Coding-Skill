package com.shreya;

public class DemoNumberFormatException 
{
  public void details()
  {
	  try
	  {
		  String s1 = "125";
		  String s2 = "XYZ";
		  int n = Integer .parseInt(s1);
		  System.out.println(n);
		  int m = Integer .parseInt(s2);
		  System.out.println(m);
	  }
	  catch(NumberFormatException   e)
	  {
		  e.printStackTrace();
				  
	  }
  }
  public static void main(String[] args) 
  {
	DemoNumberFormatException obj = new DemoNumberFormatException();
	obj.details();
	System.out.println("program completed");
}
  }

