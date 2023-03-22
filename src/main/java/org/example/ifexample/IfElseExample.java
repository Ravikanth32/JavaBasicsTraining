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
            System.out.println("This is person is kid");
        } else if (age > 10 && age <= 16) {
            System.out.println("This is person is teen");
        } else if (age > 16 && age <= 30) {
            System.out.println("This is person is adult");
        } else if (age > 30 && age <= 100) {
            System.out.println("This is person is old");
        } else {
            System.out.println("This is Person is alien");
        }


        int day = 14;
        String dayInValue = null;
        switch (day) {
            case 1:
                dayInValue = "monday";
                break;
            case 2:
                dayInValue = "tus";
                break;
            case 3:
                dayInValue = "wed";
                break;
            case 4:
                dayInValue = "thur";
                break;
            case 5:
                dayInValue = "friday";
                break;
            default:
                dayInValue = "invalid";
        }

        // for each while do while
//        String name = "ravi";
//        for(int i = 1; i <= 50 ; i = i + 50) {
//            System.out.println(name);
//        }

        // write program to print 20 table

//        int num = 20;
//        int range = 20;

//        for (int i = 1; i <= range; i++) {
//            int result = num * i;
//            if(result%3==0) {
//                System.out.println(num + " * " + i + " = " + result);
//            }
//        }

//        int i = 1;
//        while(i <= range){
//            int result = num * i;
//            if(result%3==0) {
//                System.out.println(num + " * " + i + " = " + result);
//            }
//            i++;
//        }

        int num = 20;
        int range = 20;
        int i = 21;

        do{
            int result = num * i;
            if(result%3==0) {
                System.out.println(num + " * " + i + " = " + result);
            }
            i++;
        }while(i <= range);


    }
}
