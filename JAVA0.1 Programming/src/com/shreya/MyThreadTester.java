package com.shreya;

public class MyThreadTester 
{
 public static void main(String[] args)
 {
	MyThread t1=new MyThread();
	t1.start();
	for(int i =0;i<50; i++)
		System.out.println("job-2");
}
}
