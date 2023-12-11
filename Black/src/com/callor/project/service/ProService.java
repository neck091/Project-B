package com.callor.project.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.project.BlackDto;

public class ProService {
	List<BlackDto> card = null;

	public ProService() {
		card = new ArrayList<BlackDto>();
	}

	@SuppressWarnings("null")
	public void cards() {
		int Num = 13;
		int[] nums = new int[Num];
		int index = 0;
		String[] cards = null;

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

		}//for end
		
		BlackDto blackDto = new BlackDto();
		for(int i=0; i<index; i++) {
		blackDto.cards= cards;
		}
		card.add(blackDto);
		
		

	}

}
