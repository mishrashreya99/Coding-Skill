package com.shreya;

import java.util.Scanner;

public class CountVowelConsonent
{
  public static void main(String[] args) 
  {
	int vcount=0 , ccount=0;
	Scanner s = new Scanner (System.in);
	System.out.println("enter string sentences");
	String s1 = s.nextLine();
	String s2 = s1.toLowerCase();
	for(int i =0; i<s2.length();i++)
	{
		char c =s2.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
					vcount++;
					
			}
		else
		{
			if(c>='a'&&c<='z')
			{
				ccount++;
				
			}
		}
	}
	System.out.println("vowel count is:" +vcount);
	System.out.println("consonent count is:" +ccount);
	
}
}
