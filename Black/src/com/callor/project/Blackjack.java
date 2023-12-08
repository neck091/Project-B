package com.callor.project;

import com.callor.project.service.ProService;

public class Blackjack {

	public static void main(String[] args) {
		int[] cards = new int[13];
		int index1 = 0;
		int index2 = 0;
	String card = "";

		
		
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				if (j == 0)
					cards[i] = i + 1;
				if (j == 0) {
					card = String.format("◆%d", cards[i]);
				} else if (j == 1) {
					card = String.format("♠%d", cards[i]);
				} else if (j == 2) {
					card = String.format("♥%d", cards[i]);
				} else if (j == 3) {
					card = String.format("♣%d", cards[i]);
				}

				System.out.print(card+",");

			}
		}
	}
}
