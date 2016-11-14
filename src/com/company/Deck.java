package com.company;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by student2 on 14.11.16.
 */
public class Deck extends LinkedList<Card1> {
    public Deck() {
        for (Suit s: Suit.values())
        for (Value v: Value.values()) {
            Card1 c = new Card1(s, v);
            this.add(c);
        }
        Collections.shuffle(this);
        }
}
