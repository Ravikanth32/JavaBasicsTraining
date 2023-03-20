package org.example.ifexample;

public class IfElseExample {
    public static void main(String[] args) {
        int age = 2;
        // write a logic give person is kid,teen,adult,old
        // 0 to 10 kid
        // 10 to 16 teen
        // 16 to 30 adult
        // 30 t 100 old
        // x >= 10
        // && and  ||
        if (age >= 0 && age <= 10) {

            if (age <= 1) {
                System.out.println("This is person is infant");
            } else {
                System.out.println("This is person is kid");
            }
        } else if (age > 10 && age <= 16) {
            System.out.println("This is person is teen");
        } else if (age > 16 && age <= 30) {
            System.out.println("This is person is adult");
        } else if (age > 30 && age <= 100) {
            System.out.println("This is person is old");
        } else {
            System.out.println("This is Person is alien");
        }
        System.out.println("I am out of if block");
    }
}
