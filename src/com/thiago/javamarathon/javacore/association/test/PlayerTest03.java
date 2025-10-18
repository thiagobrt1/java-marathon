package com.thiago.javamarathon.javacore.association.test;

import com.thiago.javamarathon.javacore.association.domain.Player;
import com.thiago.javamarathon.javacore.association.domain.Team;

public class PlayerTest03{
    public static void main(String[] args){
        Player player1 = new Player("Ronaldo");
        Player player2 = new Player("Adriano");
        Team team1 = new Team("Inter Milan");
        Player[] players = {player1, player2};

        player1.setTeam(team1);
        player2.setTeam(team1);
        team1.setPlayers(players);

        player1.print();
        System.out.println();
        player2.print();
        System.out.println();
        team1.print();
    }
}
