package com.thiago.javamarathon.javacore.initializationblock.test;

import com.thiago.javamarathon.javacore.initializationblock.domain.Book;

public class BookTest{
    public static void main(String[] args){
        Book book = new Book("Guns, Germs, and Steel: The Fates of Human Societies");

        for(int i = 0; i < book.getPages().length; i++){
            System.out.print(book.getPages()[i] + " ");
        }
    }
}
