package com.prodapt.game;

import java.util.Random;
import java.util.Scanner;

public class HiddenGame {

	public void findTheWord() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
		String[] wordList = { "superman", "jungle", "monday", "letter", "house", "helium" };
		for (int i = 0; i < wordList.length; i++) {
			String s = wordList[i];
			int n1 = random.nextInt(s.length());
			int n2 = random.nextInt(s.length());
			int n3 = random.nextInt(s.length());
			int n4 = random.nextInt(s.length());
			for (int j = 0; j < s.length(); j++) {
				int lenOfWord = s.length();
				if (lenOfWord <= 4 || lenOfWord < 10 && lenOfWord >= 4 || lenOfWord >= 10) {
					if (j == n1 || j == n2 || j == n3 || j == n4) {
						System.out.print("*");
					} else {
						System.out.print(s.charAt(j));
					}

				}
			}
			System.out.println();
			System.out.println("Write the correct word");
			String str1 = sc.nextLine();
			if (s.equals(str1)) {
				count++;
			}
		}
		System.out.println("Total score is :" + count);
	}
}
