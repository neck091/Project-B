package com.callor.project;

public class BlackDto {

	public static int[] cardex(int num) {

		int[] card = new int[num];


		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < card.length; i++) {
				card[i] = j;
				j++;

			}
		}
		return card;
	}
}
