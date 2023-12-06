package com.callor.project;

public class Blackjack {
	public static void main(String[] args) {

		int[] num = new int[9];

		int j = 2;
		
		for (int i = 0; i < num.length; i++) {
				num[i] = j;
				j++;
		}
	for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}
}
