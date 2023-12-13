package com.callor.project.service;

public class CardDexService {
	
	//카드덱 생성
	public String cardDex() {
		String[] cards = new String[52];
		String[] cardNum = { "A", "2", "3", "4", "5", "6", "7", 
				"8", "9", "10", "K", "Q", "J" };
		int index = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < cardNum.length; j++) {	
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
		} // 패턴 끝
		
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * cards.length);
			int num2 = (int) (Math.random() * cards.length);
			String _temp = cards[num];
			cards[num] = cards[num2];
			cards[num2] = _temp;
			
		} // 셔플 끝

		//for (int i = 0; i < cards.length; i++) {
		//System.out.println(cards[i]);
		//} 출력확인
		
		int ran = (int)(Math.random() * cards.length);
		return cards[ran];
		//카드 랜덤 뽑기
		
	}// 카드 끝

	
	
}
