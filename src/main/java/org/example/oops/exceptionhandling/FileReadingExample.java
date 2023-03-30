package org.example.oops.exceptionhandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadingExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\Learning\\Java\\Training\\JavaBasicsTraining\\src\\main\\resources\\ravi.csv");
        BufferedReader br = new BufferedReader(fileReader);
        int i = 0;
        System.out.println(br.readLine());

//        while((i = br.readLine()) != -1) {
//            System.out.print((char)i);
//        }

//        List<String> lines = Files.readAllLines(Path.of("E:\\Learning\\Java\\Training\\JavaBasicsTraining\\src\\main\\resources\\ravi.csv"));
//        System.out.println(lines);
//
//        // pdf java lib Itext jar[ class pdf reac] tkk
//
//        // slf4j


    }
}
