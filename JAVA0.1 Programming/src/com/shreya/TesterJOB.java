package com.shreya;

public class TesterJOB
{
	public static void main(String[] args)
	{
		MyThreadJoin t1 = new MyThreadJoin();
		t1.start();
		try
		{
		t1.join();
		
		for(int i=0 ; i<100 ; i++)
		{
			System.out.println("job-2");
		}
		}
	 
	 catch(Exception   e)
	 {
		 e.printStackTrace();
	
			 
		 }
	 }
}
