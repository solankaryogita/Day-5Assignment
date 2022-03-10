package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Nnumber :");
	int number = sc.nextInt();
	System.out.println("Enter the Power :");
	 int power = sc.nextInt();
	 for(int i=2;i<power;i++)
	 {
	 int powerofNumber = (int)Math.pow(number, i);
	 System.out.println("Power of a Number :"+ number +"^" + i + ":"+powerofNumber  );
	 }
	}
}
