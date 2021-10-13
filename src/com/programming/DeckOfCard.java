package com.programming;

public class DeckOfCard {
    /*
    The suits and ranks of the deck of cards are defined
    a cordCombo array shows the cards deck
     */
    private static String[] suits = {"Hearts", "clubs", "Spades", "Diamonds"};
    private static String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[][] cardCombo = new String[4][13];

    /*
    Set up deck is used to set the deck with combination
    of ranks with their respective suits.Loop generates
    52 unique cards
     */
    private void setUpDeck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cardCombo[i][j] = suits[i] + rank[j];
            }
        }
    }

    /*
    To print deck of cards.
     */
    private void toPrintDeck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                System.out.println(cardCombo[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        /*class Deck of cards called and object is created and
        initialized
         */
        DeckOfCard deckOfCards = new DeckOfCard();
        deckOfCards.setUpDeck();
        deckOfCards.toPrintDeck();

    }
}
