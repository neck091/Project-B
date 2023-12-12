package com.callor.project.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.project.BlackDto;
import com.callor.project.service.ProService;

public class Test {
	public static void main(String[] args) {
<<<<<<< HEAD
		ProService service = new ProService();
		
		service.cardDex();	//ㅇㅋ
=======
		List<BlackDto> card = new ArrayList<BlackDto>();

		int Num = 13;
		int[] nums = new int[Num];
		int index = 0;
		String[] cards = new String[52];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[j] = j + 1;

				if (i == 0) {
					cards[index] = String.format("♠%s", nums[j]);
				} else if (i == 1) {
					cards[index] = String.format("♥%s", nums[j]);
				} else if (i == 2) {
					cards[index] = String.format("♣%s", nums[j]);
				} else if (i == 3) {
					cards[index] = String.format("◆%s", nums[j]);
				}
				index++;
			}
		} // 카드 끝

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * cards.length);
			int num2 = (int) (Math.random() * cards.length);
			String _temp = cards[num];
			cards[num] = cards[num2];
			cards[num2] = _temp;

		} // 셔플 끝

		while (true) {

			for (int i = 0; i < cards.length; i++) {
				System.out.println(cards[i]);

			}
		}
>>>>>>> 43a5138b6867bc6f6db607f9cfa2c35d57e5db2b
	}
}
