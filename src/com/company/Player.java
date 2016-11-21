package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public abstract class Player {
    Hand hand = new Hand();
    private Intellect intellect;

    public void take(Card1 current) {
        hand.add(current);
    }

    public Command decision() {
        int score=hand.getScore();

        return intellect.decide(score);

    }

}
