package com.thiago.javamarathon.javacore.inheritance.test;

import com.thiago.javamarathon.javacore.inheritance.domain.Manager;

/*
1.  Static variables and static initialization blocks from the superclass are executed only once when the JVM loads the class
2.  Static variables and static initialization blocks from the subclass are executed only once when JVM loads the class
3.  Memory is allocated for the superclass
4.  Each attribute from the superclass is initialized
5.  Instance initialization blocks from the superclass are executed
6.  Constructor from the superclass is executed
7.  Memory is allocated for the subclass
8.  Each attribute from the subclass is initialized
9.  Instance initialization blocks from the subclass are executed
10. Constructor from the subclass is executed
 */

public class InheritanceTest02{
    public static void main(String[] args){
        new Manager("Thiago");
    }
}
