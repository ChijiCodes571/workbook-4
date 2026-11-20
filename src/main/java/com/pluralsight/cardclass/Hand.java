package com.pluralsight.cardclass;

import javax.naming.Name;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    // A card is dealt to the Hand and the Hand is responsible to store the card

    public void addCard(Card card){

        this.cards.add(card);
    }

    public int getSize(){

        return cards.size();
    }

    // The hand uses the methods of each card to determine the value of
    // each card and adds up all values.

    public int getValue(){
        int value = 0;
        for (Card card : cards){
            card.flip(); //turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }

    public void display(){
        String results = "";
        for (int i = 0; i < this.cards.size(); i++){
            Card c = this.cards.get(i);
            results += c.getSuit() + c.getValue();
            if(i != this.cards.size() - 1){
                results += ", ";
            }
        }

        System.out.println(results);
    }


    @Override
    public String toString(){
        String results = "";
        for (int i = 0; i < this.cards.size(); i++){
            Card c = this.cards.get(i);
            results += c.getSuit() + c.getValue();
            if(i != this.cards.size() - 1){
                results += ", ";
            }
        }

        return results;
    }

}



