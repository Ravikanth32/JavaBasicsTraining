package org.example.oops.abstractexample;

public abstract class Handler {

    int age= 0;
    public abstract void upload();
    public void download(String fileName){
        System.out.println("Get the file");
        System.out.println("Download file");
    }
}
