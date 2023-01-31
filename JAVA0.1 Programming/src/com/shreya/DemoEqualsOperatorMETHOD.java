package com.shreya;

public class DemoEqualsOperatorMETHOD
{
  public static void main(String[] args)
  {
	  String s1 = "XYZ";
	  String s2 = new String("XYZ");
	  String s3 = "xyz";
	  if(s1 ==s2)
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
	  if(s1==s3)
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
	  if(s1.equals(s2))
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
	  if(s1.equals(s3))
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
  }
}
