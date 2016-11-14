package com.company;

/**
 * Created by student2 on 11.11.16.
 */
public class Card1 {
    Suit suit;
    Value value;

    @Override
    public String toString() {
        return "Card1{" +
                value +
                " of " + suit +
                '}';
    }
    public Card1(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }


}
