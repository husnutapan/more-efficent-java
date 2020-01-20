package com.java.solution.solid.singleresponsibility;


//a class should only have one responsibility.
public class Test {
    MailService mailService = new MailService();


    void sendMail() throws EmailValidationException {
        User user = new User(1l, "test", "test@test.com");
        mailService.sendMail(user);
    }

    public static void main(String[] args) throws EmailValidationException {
        new Test().sendMail();
    }
}
