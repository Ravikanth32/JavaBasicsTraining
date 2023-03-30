package org.example.oops.exceptionhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class Testing {

    private static Logger log = LoggerFactory.getLogger(Testing.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("I am in Testing class");
        Testing testing = new Testing();
        int res = testing.div(a, b);
        System.out.println("Result is " + res);
    }

    int div(int a, int b) {
        // info error debug trace warn
        log.info("This is in dev method");
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException exception) {
            log.error(exception.getMessage() + " because of diviser value  " + b);
        } catch (IllegalArgumentException exception) {
            log.error(exception.getMessage());
        }
        log.debug(" This is in dev method but after cal debug");
        return result;
    }


//    static void m1(){
//        System.out.println("I am in m1");
//        m2();
//    }
//    static void m2(){
//        System.out.println("I am in m2");
//        try {
//            int x = 1 / 0;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        m3();
//    }
//    static void m3(){
//        System.out.println("I am in m3");
//    }
}
