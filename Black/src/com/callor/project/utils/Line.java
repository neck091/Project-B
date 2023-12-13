package com.callor.project.utils;

public class Line {

	public static void line(){
	System.out.println("+-".repeat(15));
}
	public static void dline(){
		System.out.println("=".repeat(30));
	}
		
	public static void sline(){
		System.out.println("-s".repeat(30));
	}
		
	

	public static void rule(){
	System.out.println("=".repeat(70));
	System.out.println(" + 룰 설명 + ");
	System.out.println("-".repeat(70));
	System.out.println("블랙잭의 기본규칙은 다음의 5가지입니다.\r\n"
			+ "\r\n"
			+ "1) 딜러와 플레이어 전원에게 2장씩 카드를 배부합니다.\r\n"
			+ "2) 자신의 카드의 합이 21에 가까워 지도록 카드를 추가하거나 추가 여부를 결정합니다.\r\n"
			+ "3) 카드의 합이 21을 넘어 버린 시점에서, 그 자리에서 패배가 확정됩니다.\r\n"
			+ "4) 플레이어는 카드의 합이 21을 초과하지 않는 한 원하는만큼 카드를 추가 할 수 있습니다.\r\n"
			+ "5) 딜러는 카드의 합이 17을 초과 할 때까지 카드를 추가합니다.\n");
	System.out.println("※[A] = 1점\n※[K],[Q],[J] = 10점\n※[2] ~ [10] = 숫자 그대로 계산");
	System.out.println("-".repeat(70));
	System.out.println("그럼 게임 시작!");
	System.out.println("=".repeat(70));
	
}

}
