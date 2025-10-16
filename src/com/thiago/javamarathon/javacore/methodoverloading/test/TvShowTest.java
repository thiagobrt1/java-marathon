package com.thiago.javamarathon.javacore.methodoverloading.test;

import com.thiago.javamarathon.javacore.methodoverloading.domain.TvShow;

public class TvShowTest{
    public static void main(String[] args){
        TvShow tvshow1 = new TvShow();
        TvShow tvshow2 = new TvShow();
        TvShow tvshow3 = new TvShow();

        tvshow1.setTitle("Mad Men");
        tvshow1.setGenre("Drama");
        tvshow1.setEpisodes(92);
        tvshow1.setStatus("Finished");

        System.out.println(tvshow1.getTitle());
        System.out.println(tvshow1.getGenre());
        System.out.println(tvshow1.getEpisodes());
        System.out.println(tvshow1.getStatus());

        System.out.println();

        // Method overloading
        tvshow2.init("Better Call Saul", "Drama", 63);
        tvshow2.print();
        System.out.println();
        tvshow3.init("The Shield", "Crime", 88, "Finished");
        tvshow3.print();
    }
}
