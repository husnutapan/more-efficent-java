package models;

import java.util.Optional;

public class Customer {
    private String name;
    private CardInfo cardInfo;

    public Customer(String name, CardInfo cardInfo) {
        this.name = name;
        this.cardInfo = cardInfo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<CardInfo> getCardInfo() {
        return Optional.ofNullable(cardInfo);
    }

}
