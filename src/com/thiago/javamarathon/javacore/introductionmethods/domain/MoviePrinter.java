package com.thiago.javamarathon.javacore.introductionmethods.domain;

public class MoviePrinter{
    // Reference parameters
    public void print(Movie movie){
        System.out.println("Title: " + movie.title);
        System.out.println("Genre: " + movie.genre);
        System.out.println("Year: " + movie.year);

        movie.title = "The Thing";
        movie.genre = "Science Fiction";
        movie.year = 1982;
    }
}
