package com.blz.workshop;

import java.util.ArrayList;

public class CardsPlay {

	String[] cards = new String[52];
	ArrayList<String> cardsArr = new ArrayList<>();

	public void generateCards() {

		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		// get combination
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {

				cardsArr.add(suit[i] + rank[j]);
			}
		}
	}

	public void printCards() {

		System.out.print("Cards : ");
		for (int i = 0; i < cardsArr.size(); i++) {
			System.out.print(" " + cardsArr.get(i) + "\n");
		}
	}

}