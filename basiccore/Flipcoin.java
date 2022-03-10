package com.Bridgelabz.basiccore;

import java.util.Random;

public class Flipcoin {

	public static void main(String[] args) {
		Random rand = new Random();
		int randomVal = rand.nextInt(2);
		if(randomVal < 0.5)
		{
			System.out.println("Head");
		}else
		{
			System.out.println("Tails");
		}
	}
}
