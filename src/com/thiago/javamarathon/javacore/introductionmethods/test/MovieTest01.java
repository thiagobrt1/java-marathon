package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Movie;
import com.thiago.javamarathon.javacore.introductionmethods.domain.MoviePrinter;

public class MovieTest01{
    public static void main(String[] args){
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        MoviePrinter printer = new MoviePrinter();

        movie1.title = "The Apartment";
        movie1.genre = "Romance";
        movie1.year = 1960;

        movie2.title = "My Darling Clementine";
        movie2.genre = "Western";
        movie2.year = 1946;

        printer.print(movie1);
        System.out.println();
        printer.print(movie2);

        System.out.println("----------------------");

        printer.print(movie1);
        System.out.println();
        printer.print(movie2);
    }
}
