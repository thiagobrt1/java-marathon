package com.thiago.javamarathon.javacore.association.test;

import com.thiago.javamarathon.javacore.association.domain.Player;
import com.thiago.javamarathon.javacore.association.domain.Team;

public class PlayerTest02{
    public static void main(String[] args){
        Player player1 = new Player("Mbappe");
        Team team1 = new Team("Real Madrid");

        player1.setTeam(team1);

        player1.print();
    }
}
