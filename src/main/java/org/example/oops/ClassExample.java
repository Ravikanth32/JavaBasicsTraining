package org.example.oops;

public class ClassExample {
    public static void main(String[] args) {
        Human ravi = new Human();
        ravi.walk();

        Human xyz = new Human(1);
        System.out.println(xyz.eyes);

        Human abc = new Human();
        abc.walk();
        abc.legs = 1;
        abc.walk();
    }
}
