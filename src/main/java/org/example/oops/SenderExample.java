package org.example.oops;

public class SenderExample {
    public static void main(String[] args) throws InterruptedException {
        boolean isServerAlive = EmailSenderService.ping();
        if (isServerAlive) {
            //read recitps database
            // recitps
            // read fiel get body

            EmailSenderService senderService = new EmailSenderService();
            senderService.send("xyz@gmail.com,abc@gmail.com", "look into this issue", "resolve ticket 123");
        }
        System.out.println("I am out of if within in the main");
        EmailSenderService.Example example = new EmailSenderService.Example();
        example.name="something";
//        example.something();
        EmailSenderService.Example.something();
        System.out.println(EmailSenderService.Example.iamStaticVar);

    }
}

/// SenderExample.main(1234)
