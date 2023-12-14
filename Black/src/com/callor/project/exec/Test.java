package com.callor.project.exec;

import com.callor.project.service.ProService;
import com.callor.project.utils.Line;

public class Test {
	public static void main(String[] args) {

		ProService proto = new ProService();

		// System.out.println( service.getCard());

		// for(int i=0; i<52; i++) {
		// System.out.println(service.getCard());

		// System.out.println(service.socore("12"));
		// service.game();

		// service.game();

		int scoreD = 0;
		int scoreP = 0;
		String cardGet = null;
		int index = 0;

		cardGet = proto.getCard();
		scoreP += proto.socore(cardGet);
		System.out.printf("당신이 받은 카드는\n");

		System.out.print("\t┌──────┐\n");
		System.out.printf(String.format("\t│%3s   │\n", cardGet));
		System.out.printf("\t│      │\n");
		System.out.printf(String.format("\t│  %3s │\n", cardGet));
		System.out.print("\t└──────┘\n");
		System.out.println("\n입니다.");


	}
	
	
/*public void printCard(String getCard) {
		
		getCard=getCard.substring(0,1);
		getCard
		
		System.out.print ("\t┌──────┐\n");
		System.out.printf(String.format("\t│%3s   │\n",getCard));
		System.out.printf("\t│      │\n");
		System.out.printf(String.format("\t│  %3s │\n",getCard));
		System.out.print ("\t└──────┘\n");
		
	}*/

}
