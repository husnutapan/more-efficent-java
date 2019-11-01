package com.java.efficent.integration.model;

public class Contact {
    private Long id;
    private String email;
    private String number;


    public Contact(Long id, String email, String number) {
        this.id = id;
        this.email = email;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
