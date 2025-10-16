package com.thiago.javamarathon.javacore.staticmodifier.domain;

/*
1. Static initialization block is executed only once when JVM loads the class
2. Memory allocated
3. Each attribute is initialized
4. Instance initialization block
5. Constructor is executed
 */

public class Book{
    private String title;
    private static int[] pages;

    static{
        System.out.println("Executing static initialization block 1");

        pages = new int[480];

        for(int i = 0; i < pages.length; i++){
            pages[i] = i + 1;
        }
    }

    static{
        System.out.println("Executing static initialization block 2");
    }

    public Book(){
        for(int i = 0; i < pages.length; i++){
            System.out.print(pages[i] + " ");
        }

        System.out.println();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public static int[] getPages(){
        return pages;
    }

    public static void setPages(int[] pages){
        Book.pages = pages;
    }
}
