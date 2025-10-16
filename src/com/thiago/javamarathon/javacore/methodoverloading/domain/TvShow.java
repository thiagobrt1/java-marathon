package com.thiago.javamarathon.javacore.methodoverloading.domain;

public class TvShow{
    private String title;
    private String genre;
    private int episodes;
    private String status;

    public void init(String title, String genre, int episodes){
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
    }

    public void init(String title, String genre, int episodes, String status){
        this.init(title, genre, episodes);
        this.status = status;
    }

    public void print(){
        System.out.println(title);
        System.out.println(genre);
        System.out.println(episodes);
        System.out.println(status);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String name){
        this.title = name;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getEpisodes(){
        return episodes;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
