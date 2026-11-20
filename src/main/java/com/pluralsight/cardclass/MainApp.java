package com.pluralsight.cardclass;

public class MainApp {
    public static void main(String[] args){
        Deck deck = new Deck();
//        deck.shuffle();

        Playa playa1 = new Playa("Dexter");

        Hand hand = new Hand();

        Card card = deck.deal();
        hand.addCard(deck.deal());

        card = deck.deal();
        hand.addCard(card);

        System.out.println(hand.toString());


//        Hand hand1 = new Hand();
//
//        // deal 5 cards
//           for (int i = 0; i < 5; i++){
//               //get a card from the deck
//               Card card = deck.deal();
//               //deal that card to the hand
//               hand1.addCard(card);
//           }
//
//           int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);
    }
}

