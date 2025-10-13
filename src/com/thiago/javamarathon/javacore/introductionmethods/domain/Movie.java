package com.thiago.javamarathon.javacore.introductionmethods.domain;

public class Movie{
    public String title;
    public String genre;
    public int year;

    // this keyword
    public void print(){
        System.out.println(this.title);
        System.out.println(this.genre);
        System.out.println(this.year);
    }
}
