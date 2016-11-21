package com.company;

import java.util.LinkedList;

/**
 * Created by student2 on 14.11.16.
 */
public class Hand extends LinkedList<Card1> {
    public int getScore() {
        int sum = 0;
        for (Card1 c:this) sum += c.getScore();
        if(this.hasAce() && sum+10<=21)
            sum += 10;
        return sum;
    }

    private boolean hasAce() {
        for (Card1 c: this)
            if(c.value == Value.ACE)
                return true;
        return false;
    }
}
