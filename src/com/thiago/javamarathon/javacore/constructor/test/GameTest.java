package com.thiago.javamarathon.javacore.constructor.test;

import com.thiago.javamarathon.javacore.constructor.domain.Game;

public class GameTest{
    public static void main(String[] args){
        Game game1 = new Game("Super Metroid", "Action-adventure, Metroidvania", 1994, "Nintendo R&D1", "Nintendo");
        game1.print();

        System.out.println();

        Game game2 = new Game("Team Fortress 2", "First-person shooter, Multiplayer", 2007, "Valve");
        game2.print();

        System.out.println();

        Game game3 = new Game();
        game3.print();
    }
}
