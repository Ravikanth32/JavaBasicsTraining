package org.example.ifexample;

public class SwitchCaseExample {

    public static void main(String[] args) {
//        int i = 3;
//        switch (i){
//            case 1:
//                System.out.println("I am 1");
//                break;
//            case 2:
//                System.out.println("I am 2");
//                break;
//            case 3:
//                System.out.println("I am 3");
//                break;
//            default:
//                System.out.println("I am default");
//        }
//
//        int month = 5;
//        int days;
//        switch (month){
//            case 1:
//            case 3:
//            case 4:
//                days = 31;
//                break;
//            case 2:
//                days = 28;
//                break;
//            case 5:
//            case 11:
//            default: days = 30;
//        }
//        System.out.println(days);

        String name = "ravi";
//        switch (name){
//            case "ravi":
//                System.out.println(" I am ravi");
//                break;
//            case "ram":
//                System.out.println("I am ram");
//                break;
//            default:
//                System.out.println("I am none");
//        }
        int age = 0;
//        switch (name){
//            case "ravi":
//                age= 30;
//                break;
//            case "ram":
//                age= 29;
//                break;
//        }
//        System.out.println(""+age);

        name = null;
        switch(name){
            case "ravi"-> age = 30;
            case "ram" -> age = 29;
            case null -> age = 0;
            default -> throw new IllegalStateException("Unexpected value: " + name);
        }
        System.out.println(age);


    }
}
