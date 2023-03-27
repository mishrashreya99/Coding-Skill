package com.shreya;

public class DemoCapacity
{
  public static void main(String[] args) 
  {
	StringBuilder sb = new StringBuilder();
	System.out.println(sb.capacity());
	sb.append("abcdefghijklmnoprst");
	System.out.println(sb.capacity());
}
}
