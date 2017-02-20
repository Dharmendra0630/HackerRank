package com.main.hacker_rank.ifElse;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		System.out.println("here git changes..........................");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		}
		
		else if (n >= 2 && n <= 5) {ans = "Not Weird";} 
		else if (n >= 6 && n <= 20) {ans = "Weird";	}
		else if (n >= 20) {	ans = "Not Weird";}

		else {
			ans = "2nd not wierd";
		}
		System.out.println(ans);

	}
}
