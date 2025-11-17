package com.thiago.javamarathon.javacore.association.domain;

/*
Bidirectional one-to-many:
Many Players belong to one Team,
and that Team also knows its Players
 */

public class Team{
    private String name;
    private Player[] players;

    public Team(String name){
        this.name = name;
    }

    public Team(String name, Player[] players){
        this.name = name;
        this.players = players;
    }

    public void print(){
        System.out.println(name);

        if(players != null){
            for(int i = 0; i < players.length; i++){
                System.out.println(players[i].getName());
            }
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Player[] getPlayers(){
        return players;
    }

    public void setPlayers(Player[] players){
        this.players = players;
    }
}
