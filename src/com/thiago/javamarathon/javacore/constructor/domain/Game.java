package com.thiago.javamarathon.javacore.constructor.domain;

public class Game{
    private String title;
    private String genre;
    private int year;
    private String developer;
    private String publisher;

    public Game(){
        System.out.println("Inside no args constructor");
    }

    // Overloading the constructor
    public Game(String title, String genre, int year, String developer){
        this();
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.developer = developer;
    }

    public Game(String title, String genre, int year, String developer, String publisher){
        this(title, genre, year, developer);
        this.publisher = publisher;
    }

    public void print(){
        System.out.println(title);
        System.out.println(genre);
        System.out.println(year);
        System.out.println(developer);
        System.out.println(publisher);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getDeveloper(){
        return developer;
    }

    public void setDeveloper(String developer){
        this.developer = developer;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}
