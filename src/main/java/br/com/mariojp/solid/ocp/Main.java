package br.com.mariojp.solid.ocp;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<CustomerType, DiscountStrategy> strategies = Map.of(
            CustomerType.REGULAR, new RegularDiscount(),
            CustomerType.PREMIUM, new PremiumDiscount(),
            CustomerType.PARTNER, new PartnerDiscount()
        );

        DiscountCalculator calc = new DiscountCalculator(strategies);

        System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
        System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
        System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
    }
}
