package com.thiago.javamarathon.javacore.association.test;

import com.thiago.javamarathon.javacore.association.domain.Player;

public class PlayerTest01{
    public static void main(String[] args){
        // Arrays with objects
        Player p1 = new Player("Messi");
        Player p2 = new Player("Zidane");
        Player p3 = new Player("Ceni");

        Player[] players = {p1, p2, p3};

        for(int i = 0; i < players.length; i++){
            players[i].print();
        }
    }
}
