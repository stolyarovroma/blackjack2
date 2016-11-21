package com.company;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new LinkedList<>();
        players.add(new Computer(new LimitItellect(17)));
        players.add(new Computer(new LimitItellect(20)));
        players.add(new Computer());
        players.add(new Computer());
        players.add(new Human());
        Dealer dealer = new Dealer();
        players.add(dealer);
        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);
        }
    for(Player player: players){
        while(true) {

            Command command = player.decision();
            if(command == Command.STAND)
                break;
            if(command==Command.HIT)
                dealer.deal(player);
        }
        }
    }
}