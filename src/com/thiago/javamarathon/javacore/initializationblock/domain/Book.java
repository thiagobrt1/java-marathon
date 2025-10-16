package com.thiago.javamarathon.javacore.initializationblock.domain;

/*
1. Memory allocated
2. Each attribute is initialized
3. Instance initialization block is executed
4. Constructor is executed
 */

public class Book{
    private String title;
    private int[] pages;

    // Instance initialization block
    {
        pages = new int[480];

        for(int i = 0; i < pages.length; i++){
            pages[i] = i + 1;
        }
    }

    public Book(){
        for(int i = 0; i < pages.length; i++){
            System.out.print(pages[i] + " ");
        }

        System.out.println();
    }

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int[] getPages(){
        return pages;
    }

    public void setPages(int[] pages){
        this.pages = pages;
    }
}
