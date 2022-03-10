package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
	System.out.println("Enter the value of num1 and num2 ::");
	Scanner sc=new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 =sc.nextInt();
	int Quotient=0,Remainder=0;
	
	Quotient=num1/num2;
	Remainder=num1%num2;
	
	System.out.println("Quotient when "+num1+"/"+num2+" is::"+Quotient);
	System.out.println("Remainder when "+num1+ "is divided by "+ num2+" is::"+Remainder);
	}
}
