package 
com.shreya;

import java.util.Scanner;

public class Factorial 
{
		public static void main(String[] args) 
{
	    int num, fact=1;
	    Scanner s =new Scanner(System.in);
	    System.out.println("enter the number");
	    num= s.nextInt();
	    if(num<0)
	    {
	    	System.out.println("for negative number factorial does not exist");
	    }
	    else
	    {
	    	for(int i=1; i<=num;i++)
	    	{
	    		fact =fact*i;
	    	}
	    	System.out.println("the factorial is :"+fact);
	    }
}
}
