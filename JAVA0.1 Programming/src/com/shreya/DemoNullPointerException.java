package com.shreya;

public class DemoNullPointerException 
{
  public void display()
  {
	 try
	 {
	  String s1 ;
	  System.out.println(s1);
  }
	 catch(NullPointerException e)
	 {
		 e.printStackTrace();
	 }
  }
  public static void main(String[] args) 
  {
	DemoNullPointerException obj = new DemoNullPointerException();
	obj.display();
}
}
