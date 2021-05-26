package com.prodapt.game;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Choose 1 for Jumble game");
		System.out.println("Choose 2 for Hidden game");
		c = sc.nextInt();
		switch (c) {
		case 1:
			JumbleGame jg = new JumbleGame();
			jg.startGame();
			c++;
			break;
		case 2:
			HiddenGame game2 = new HiddenGame();
			game2.findTheWord();
			c++;
			break;
		default:
			System.out.println("Please enter the correct choice");
		}while(c!=2);

	}

}
