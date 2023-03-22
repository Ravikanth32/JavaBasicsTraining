package org.example.oops;

public class EmailSenderService {

    public void send(String recipients, String body, String subject) throws InterruptedException {
        if (recipients != null) {
            boolean isConnectionEstablished = connectToServer();
            String[] emails = recipients.split(",");
            for (int i = 1; i <= emails.length-1; i++) {
                String email = emails[i];
                if (isConnectionEstablished) {
                    String message = body + subject;
                    String deliveryMessage = transferMessage(email, message);
                    if (deliveryMessage != null && deliveryMessage.equals("Success"))
                        System.out.println("Email sent");
                    else
                        System.out.println("Something wrong email sent failed");
                }
            }
        }
    }

    private boolean connectToServer() throws InterruptedException {
        System.out.println("Connecting .......");
        Thread.sleep(1000);
        System.out.println("Connected to Server");
        return true;
    }

    private String transferMessage(String recipients, String message) throws InterruptedException {
        System.out.println("Message posted " + message + " to" + recipients);
        Thread.sleep(1000);
        return "Success";
    }

    public static boolean ping() {
        System.out.println("Ping to SMTP server");
        return true;
    }

    static class Example{
        public String name= "Ravi";
        public static String iamStaticVar="ravi";
        public static void something(){
            System.out.println("something");
        }
    }

}
