package com.shreya;

public class MyThreadGET extends Thread
{
	 public void run()
	 {
		 for(int i=0; i<25; i++)
		 {
			 System.out.println("job-1");
		 }
	 }
}
