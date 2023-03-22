package org.example.oops;

public class Human {
    int legs;
    int eyes;
    int ears;
    int nose;
    static String parentName = "xyz";

    Human() {
    }

    Human(int eyes) {
        this.eyes = eyes;
    }

//    Human() {
//        System.out.println(" I am default constructor");
//    }

    {
        System.out.println("I am instance block");
    }

    static {
        System.out.println("I am static block");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void walk() {
        System.out.println("Walking with " + this.legs);
    }

    void run(boolean flag,int legs) {
       System.out.println("I am run");
    }


}
