package com.Bridgelabz.basiccore;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("character is Vowel :"+ch);
		}
		else 
		{
			System.out.println("character is Consonant :"+ch);
		}
	}
}