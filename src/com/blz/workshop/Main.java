package com.blz.workshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number of players :");
		int playerCount = sc.nextInt();

		CardsPlay play = new CardsPlay(playerCount);
		play.generateCards();
		play.addPlayer();

	}
}
