package org.example.ifexample;

public class ForExample {

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if(i % 10 == 0)
                continue;
            System.out.println(i);
        }
        System.out.println("I am out of for");
    }
}
