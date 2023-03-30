package org.example.oops.abstractexample;

public class CasioCalculator implements Calculator{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void div(int a, int b) {
        System.out.println(a/b);
    }

    @Override
    public void multi(int a, int b) {
        System.out.println(a*b);
    }


    public void add(long a, long b){
        System.out.println(a+b);
//        return a+b;
    }
}
