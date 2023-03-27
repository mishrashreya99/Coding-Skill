package com.shreya;

public class TesterPriority 
{
	 public static void main(String[] args) 
	 {
		 MyThreadPriority t1 = new MyThreadPriority();
		 t1.start();
		 
		 try
			 {
				 System.out.println("Thread priority is:"+ t1.getPriority());
				 t1.setPriority(8);
				 System.out.println(" thread priority is:" + t1.getPriority());
			 }
		 catch(Exception   e)
		 {
			 e.printStackTrace();
		
				 
			 }
		 }
}

