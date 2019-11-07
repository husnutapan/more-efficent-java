package optional;

import models.CardInfo;
import models.Customer;

import java.util.Optional;

public class OptionalAvoidToNPE {

    String discount(Customer customer) {
        return customer.getCardInfo().flatMap(cardInfo -> getDiscountPercentage(cardInfo))
                .map(discountVar -> "Discount is: " + discountVar)
                .orElse("No Discount");
    }

    private Optional<Object> getDiscountPercentage(CardInfo cardInfo) {
        if (cardInfo.getCardPoint() >= 100)
            return Optional.of(10);
        else if (cardInfo.getCardPoint() >= 50)
            return Optional.of(5);
        return Optional.empty();
    }

    public static void main(String[] args) {
        OptionalAvoidToNPE optionalAvoidToNPE = new OptionalAvoidToNPE();
        System.out.println(optionalAvoidToNPE.discount(new Customer("Husnu", new CardInfo(130))));
        System.out.println(optionalAvoidToNPE.discount(new Customer("Test", new CardInfo(78))));
        System.out.println(optionalAvoidToNPE.discount(new Customer("Other", new CardInfo(10))));
    }

}
