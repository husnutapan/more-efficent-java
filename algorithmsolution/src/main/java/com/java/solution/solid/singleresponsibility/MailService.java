package com.java.solution.solid.singleresponsibility;

public class MailService {
    MailValidator mailValidator = new MailValidator();

    public void sendMail(User user) throws EmailValidationException {
        if (mailValidator.isValid(user.getEmail())) {
            System.out.println("Email delivered succefully to:" + user.getUsername());
        } else {
            throw new EmailValidationException("Email didnt validate conditions.");
        }
    }
}
