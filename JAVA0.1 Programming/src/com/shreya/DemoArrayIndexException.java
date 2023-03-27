package com.shreya;

public class DemoArrayIndexException 
{
   public static void arrayDemo()
   {
	   int n[] = new int [5];
	   try
	   {
		   n[0] = 10;
		   n[1] = 15;
		   n[2] = 20;
		   n[3] = 25;
		   n[4]  = 30;
		  // n[5]  = 35;
		   for(int i =0; i<n.length;i++)
		   {
			   System.out.println(n[i]);
		   }
	   }
	   catch(ArrayIndexOutOfBoundsException  e)
	   {
		   e.printStackTrace();
	   }
   }
   public static void main(String[] args)
    {
	   DemoArrayIndexException.arrayDemo();
	   System.out.println("program execution completed");
	
}
}
