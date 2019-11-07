package models;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private Date registrationDate;
    private Boolean isAdmin;


    public Employee(String firstName, String lastName, Boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationDate = randomCreateDate();
        this.isAdmin = isAdmin;
    }

    private Date randomCreateDate() {
        int createRandom = getRandom(1, 20);
        LocalDate localDate = LocalDate.of(2000 + createRandom, 10, 11);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }


    public static int getRandom(double min, double max) {
        return (int) ((Math.random() * (max + 1 - min)) + min);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}