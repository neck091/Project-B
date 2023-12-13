package com.callor.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.project.dto.BlackDto;
import com.callor.project.utils.Line;

public class ProService {

	List<BlackDto> card = null;
	Scanner scan = null;

	public ProService() {
		card = new ArrayList<BlackDto>();
		scan = new Scanner(System.in);
	}

	// 랜덤 카드덱 생성 完
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

	// 중복 확인 코드 完
	private BlackDto select(String num) {

		for (BlackDto dto : card) {
			if (dto.getCard.equals(num))
				return dto;
		}
		return null;
	}

	// 카드뽑기이 完
	public String getCard() {
		BlackDto bDto = new BlackDto();

		while (true) {
			bDto.getCard = this.cardDex();
			BlackDto dto = this.select(bDto.getCard); // select 에 뽑은 카드를 보내고 중복임을 판단
			if (dto != null) {
				// System.out.println("중복"); 중복 확인용
				continue;
			} else {
				break;
			}
		}
		card.add(bDto);

		return bDto.getCard;

	}// 뽑은 카드는 리스트에 추가

	// 카드별 점수 계산 完
	public int socore(String result) {
		int num = 0;
		// String
		result = result.substring(1);

		// System.out.println(result);//확인용 출력 숨김 처리 要

		if (result.equals("A")) // System.out.println(1);
			return 1;
		else if (result.equals("K"))// System.out.println(10);
			return 10;
		else if (result.equals("Q"))// System.out.println(10);
			return 10;
		else if (result.equals("J"))// System.out.println(10);
			return 10;

		result = result.replace("A", "");
		result = result.replace("K", "");
		result = result.replace("Q", "");
		result = result.replace("J", "");

		for (int i = 2; i < 11; i++) {
			if (result.equals(i + "")) { // return num;
				num = Integer.valueOf(result);
				// System.out.println(num);
				break;
			}
		} // 숫자 계산
		return num;
	}// 정산 끝

	
	//점수 합산 & 게임 진행 完
	public void start() {

		int scoreD = 0;
		int scoreP = 0;
		String cardGet = null;
		int index = 0;

		while (true) {
			if (index == 0) {
				Line.sline();
				System.out.println("딜러와 플레이어에게 카드를 2장씩 배부합니다.");
				Line.sline();
				cardGet = this.getCard();
				scoreD += this.socore(cardGet);
				cardGet = this.getCard();
				scoreD += this.socore(cardGet);
				if(scoreD==21) { 
					
					break;
				}
			}//처음한번만

			cardGet = this.getCard();
			scoreP += this.socore(cardGet);
			System.out.printf("당신이 받은 카드는 %s ", cardGet);
			if (index == 0) {
				cardGet = this.getCard();
				scoreP += this.socore(cardGet);
				System.out.printf(", %s ", cardGet);
			}//처음한번만
			System.out.println("입니다.");
			
			if (21 < scoreP) break;
			if (21 == scoreP) break;

			index ++;

			if (scoreD < 17) {
				System.out.println("딜러의 점수가 17 미만이므로 카드를 한 장 더 가져갑니다.");
			}
			
			if(scoreD>21)break;
			if(scoreD==21) break; 
			
			

			System.out.println("\n ☞ 현재 점수 : " + scoreP + "\n [[ HIT or STOP ]]");
			System.out.print(" >>> ");
			String str = scan.nextLine();
			if (str.equals("HIT")) {

				Line.sline();
				System.out.println("[ HIT ] - 카드를 추가합니다.");
				Line.sline();
				continue;
			}
			
			else if (str.equals("STOP")) {
				Line.sline();
				System.out.println("[ STOP ] - 카드를 더 이상 추가하지 않습니다.");
				Line.sline();
				break;
			}
			
	}
	
		System.out.println("+=======+ Game Over +=======+");
		if (21==scoreP) {
			System.out.println("[[[!s-s-s BLACKJACK s-s-s!]]]");
			System.out.println("<<-+ !YOU WIN! +->>");
			System.out.println("잭팟! 카드의 합이 21로 블랙잭입니다.\n축하합니다. 승리하셨습니다.");
		}
		else if (21 < scoreP){
			System.out.println("<<<! YOU LOSE !>>>");
			System.out.println("카드의 합이 21 이상입니다.\n아쉽게도 패배하셨습니다.");
			
		}
		else if (21-scoreP < 21-scoreD) {
			System.out.println("<<-+ YOU WIN +->>");
			System.out.println("카드의 합이 딜러보다 21에 더 가깝습니다. 축하드립니다.\n승리하셨습니다.");
		}
		else if (21-scoreP == 21-scoreD) {
			System.out.println("<<-- TIE -->>");
			System.out.println("카드의 합이 딜러와 동점입니다.\n무승부로 끝났네요.");
		}
		else if (21-scoreP > 21-scoreD) {
			System.out.println("<<<! YOU LOSE !>>>");
			System.out.println("카드의 합이 딜러보다 21에서 멉니다.\n아쉽게도 패배하셨습니다.");
		}
		else if (21<scoreD) {
			System.out.println("딜러의 점수가 21 이상입니다. 축하합니다. 승리하셨습니다.");
			System.out.println("<<-+ YOU WIN +->>");
		}
		else if (21==scoreD && index==0 ) {
			System.out.println("딜러가 처음 받은 카드의 합이 21이므로 무승부로 처리합니다.");
			System.out.println("<<-- TIE -->>");		
		}
		
		System.out.println("-".repeat(30));
		System.out.printf("플레이어의 점수 : %d\n",scoreP);
		System.out.printf("딜러의 점수 : %d\n",scoreD);

	}
	
	// 게임 실행 完
		public void game() {
			Line.rule(); // 초반 1번만 룰 설명
			while(true) {
				Line.line();
			System.out.println("+=======+ Game Start +=======+");
			Line.line();
			this.start();
			Line.dline();
			System.out.println("다시 도전하시겠습니까? ( YES or NO )");
			System.out.print(">>>");
			String str = scan.nextLine();
			if (str.equals("YES")) continue;
			else if (str.equals("NO")) break;
			}
			Line.dline();
			System.out.println("잘 생각하셨습니다. 도박은 멀리하는게 좋죠.");
			System.out.println("안녕히가세요.");
			Line.dline();
		}// 게임 끝
	
	
}
