package com.callor.project.exec;

import com.callor.project.service.ProService;

public class Test {
	public static void main(String[] args) {

		ProService service = new ProService();

		service.cardDex();
		
		System.out.println(	service.cardDex());
		
		for(int i=0; i<52; i++) {
			System.out.println(service.getCard());
		
		}
		

		

		}
	}
