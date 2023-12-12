package com.callor.project.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.project.dto.BlackDto;

public class ProService {
	
	// 랜덤 카드덱 생성
 	public String[] cardDex() {
		String[] cards = new String[52];
		String[] cardNum = { "A", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "K", "Q", "J" };
		int index = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[index] = cardNum[j];

				if (i == 0) {
					cards[index] = "♠" + cardNum[j];
				} else if (i == 1) {
					cards[index] = "♥" + cardNum[j];
				} else if (i == 2) {
					cards[index] = "♣" + cardNum[j];
				} else if (i == 3) {
					cards[index] = "◆" + cardNum[j];
				}
				index++;

			}

		}

		for (int i = 0; i < 100; i++) {
			int index1 = (int) (Math.random() * cards.length);
			int index2 = (int) (Math.random() * cards.length);
			String _temp = cards[index1];
			cards[index1] = cards[index2];
			cards[index2] = _temp;
		}

		//for (int i = 0; i < cards.length; i++) {
			//System.out.println(cards[i]);} 카드 출력 확인
		//System.out.println(cards.length); 카드 개수 확인

		return cards;
	}// 카드덱 끝

	//카드 분배
	public void pro() {
		int scoreP= 0;
		int scoreD= 0;
		
		while (true) {
			System.out.println();
		}
		
		
	}//카드 분배 끝
	
	//카드 점수 정산
	public int score() {
		
		for(int i=0; i<13;i++) {
			this.cardDex();
	
		}

		
		
		return 0;
		
	}//정산 끝
	
	
}
