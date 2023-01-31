package com.shreya;

public  class DemoLocal
{
		public void display()
		{
			String cityName ="Lucknow";
			int population =1000000;
			System.out.println("City name is"+cityName);
			System.out.println("population is"+population);
		}
		public static void main (String [] args)
		{
			DemoLocal d = new DemoLocal();
			d.display();
		}
}
