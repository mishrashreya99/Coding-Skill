package com.shreya;

import java.util.Scanner;

public class ArmstrongNumber
{
		public static void main(String[] args)
		{
			int num1 ,num2 , num3, count=0,res=0,rem;
			Scanner s =new Scanner(System.in);
			System.out.println("enter the number");
			num1 = s.nextInt();
			num2=num1;
			num3=num1;
			while(num1 != 0)
			{
				count++;
				num1 =num1/10;
			}
			while(num2 !=0)
			{
				rem= num2%10;
				res = (int)(res + Math.pow(rem, count));
				
				num2 =num2/10;
			}
			if(num3==res)
			{
				System.out.println("armstrong number");
			}
			else
		  
		{
			System.out.println("not a armstrong");
		}
		}
}
