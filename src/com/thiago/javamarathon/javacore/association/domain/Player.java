package com.thiago.javamarathon.javacore.association.domain;

/*
Bidirectional many-to-one:
Many Players belong to one Team,
and that Team also knows its Players
 */

public class Player{
    private String name;
    private Team team;

    public Player(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(name);

        if(team != null){
            System.out.println(team.getName());
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Team getTeam(){
        return team;
    }

    public void setTeam(Team team){
        this.team = team;
    }
}
