package org.example.oops.exceptionhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {

    private static Logger logger = LoggerFactory.getLogger(Example.class);
    public static void main(String[] args) {
        logger.info("Before add");
        int result = add(2,3);
        logger.info("after add");
        logger.info("Before multiply");
        int multiplyResult = multiply(result);
        logger.info("after multiply");
        System.out.println(multiplyResult);
    }

    static int add(int a, int b){
        int result = 0;
        try {
             result= a + b;
            //int i = 1 / 0;
        }catch (Exception ex){
            logger.error(ex.getMessage());
            throw new RuntimeException();
        }finally {
            System.out.println("I am in finally");
        }
        return result;
    }

    static int multiply(int a){
        return 10 * a;
    }
}
