package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)
		{
			if(a > c)
			{
				System.out.println("a is grether ");
			}else 
			{
				System.out.println("c is larhest");
			}
		}
		else
		{
			if(b > c)
			{
				System.out.println("b is a largest");
				
			}
			else
			{
				System.out.println("c is a largest");
			}
		}
	}
}
