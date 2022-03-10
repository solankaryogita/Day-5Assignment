package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class Swappenumber {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter the number x and y");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("x before swapped :" +x);
		System.out.println("y before swapped :" +y);
		
		temp = x;
	    x = y;
	    y = temp;
	    
		System.out.println("x after swapped :" +x);
		System.out.println("y after swapped :" +y);
	}
}
