package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	System.out.println("Enter the year");
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	{
		System.out.println("Year is leap year :"+year);
		
	}else {
		System.out.println("Year is Not Leap Year :"+year);
	}	
	}
}
