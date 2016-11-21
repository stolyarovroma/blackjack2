package com.company;

/**
 * Created by student2 on 18.11.16.
 */
public class LimitItellect extends Intellect {
    public LimitItellect(int limit) {
        this.limit = limit;
    }

    private int limit;

    @Override
    public Command decide(int score) {
        if (score<limit)
            return Command.HIT;
        else
            return Command.STAND;
    }
}
