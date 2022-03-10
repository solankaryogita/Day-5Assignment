package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		
		System.out.print("Enter any number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
       System.out.print("The Harmonic Series is : " );
        double sum = 0.0;
     
          for(int i=1;i<=num;i++ )
          {
              sum = sum + (double) 1 / i;
              System.out.println(sum +" ");
          }
       System.out.print("output of Harmonic Series is : " +sum);
    }
}