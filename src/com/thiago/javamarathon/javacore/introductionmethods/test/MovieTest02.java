package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Movie;

public class MovieTest02{
    public static void main(String[] args){
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.title = "Blue Velvet";
        movie1.genre = "Thriller";
        movie1.year = 1986;

        movie2.title = "Shaun of the Dead";
        movie2.genre = "Comedy";
        movie2.year = 2004;

        movie1.print();
        System.out.println();
        movie2.print();
    }
}
