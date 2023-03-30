package org.example.oops.abstractexample;

public class FileHandler extends Handler {

    FileHandler(){
        System.out.println("I am Parent class cons");
    }

    FileHandler(int age){
        System.out.println("I am parent paramter cons");
    }

    @Override
    public void upload() {
        System.out.println("I am in uploading process");
    }

    public void fileHandle(){
        System.out.println("I am parent fileHandle method");
    }
}
