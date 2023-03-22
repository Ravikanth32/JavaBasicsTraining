package org.example.oops;

public class Human {
    int legs = 2;
    int eyes = 2;
    int ears = 2;
    int nose = 1;
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

    static class Child {

    }
}
