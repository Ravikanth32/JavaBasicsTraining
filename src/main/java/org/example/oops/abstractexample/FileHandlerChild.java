package org.example.oops.abstractexample;

public class FileHandlerChild extends FileHandler{

    FileHandlerChild(){
        super(12);
        System.out.println("I am child const");
    }
    public void fileHandlerChild(){
        System.out.println("I am FileHandlerChild");
    }

    @Override
    public void fileHandle(){
        super.fileHandle();
        super.upload();
        System.out.println("I am child fileHandle");
    }

}
