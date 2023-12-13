package com.callor.project.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.project.dto.BlackDto;
import com.callor.project.utils.Line;

public class ProService {

	List<BlackDto> card = null;

	public ProService() {
		card = new ArrayList<BlackDto>();
	}

	// 랜덤 카드덱 생성
	public String cardDex() {
		String[] cards = new String[52];
		String[] cardNum = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
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

		// for (int i = 0; i < cards.length; i++) {
		// System.out.println(cards[i]);
		// } 출력확인

		// BlackDto bDto = new BlackDto();
		// bDto.getCard = cards[ran];

		// card.add(bDto)

		// 카드 랜덤 뽑기
		int ran = (int) (Math.random() * cards.length);
		return cards[ran];

	}// 카드 끝

	
	private BlackDto select(String num) {
		// students 는 list 타입
		// students 요소는 StudentDto 타입
		// 이 명령은 students 리스트 개수만큼 반복
		// 반복하면서 students 리스트의 개별 요소를 get(읽기) 하여
		// studentDto type 인 dto 에 할당하여 코드블럭에 전달하라

		for(BlackDto dto: card) {
			if(dto.getCard.equals(num)) return dto;
		}
		return null;
	}
	
	
	public String getCard() {
		BlackDto bDto = new BlackDto();
		
		while(true) {
			bDto.getCard = this.cardDex();
		BlackDto dto = this.select(bDto.getCard); //select 에 뽑은 카드를 보내고 중복임을 판단
			if(dto!=null) {
			//System.out.println("중복"); 중복 확인용 
			continue;
		}else {
			break;
		}
	}
		card.add(bDto);
		
		return bDto.getCard;

	}// 뽑은 카드는 리스트에 추가

	public void cardGet() {
		while (true) {

			{

			}

		}

	}

	// 게임
	public void game() {
		Line.line();
		System.out.println(" + Game Start + ");
		Line.line();

		while (true) {

			this.getCard();

		}

	}// 게임 끝

	// 카드 점수 정산
	public int score() {
		String result = this.cardDex().substring(1);
		int num = Integer.valueOf(result);

		if (result.equals("A"))
			return 1;

		for (int i = 2; i < 10; i++) {

			if (num == i)
				return i;
		}

		return 10;

	}// 정산 끝

}
