package org.example.oops.thiskeyword;

public class Testing {
    public static void main(String[] args) {
//        A a = new A(1);
//        a.m1();
//        a.m2();

        A.m4();
    }
}

class A{
    static String name="ravi";
    A(){
        System.out.println(" I am default");
    }
    A(int a, int b){
        System.out.println("with 2 paramters");
    }
    A(int a){
        this(2,3);
        System.out.println(a);
    }
    void m2(){
        this.m3();
        System.out.println("m2");
    }
    public void m1(){
        System.out.println("I am m1");
    }

    private void m3(){
        System.out.println("m3"+name);
    }

    static void m4(){
        System.out.println("M4"+name);
    }

}