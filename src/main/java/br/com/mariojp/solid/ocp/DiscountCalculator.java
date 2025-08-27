package br.com.mariojp.solid.ocp;

import java.util.Map;
import java.util.HashMap;

public class DiscountCalculator {

    private final Map<CustomerType, DiscountStrategy> strategies = new HashMap<>();

   
    public DiscountCalculator() {
        strategies.put(CustomerType.REGULAR, new RegularDiscount());
        strategies.put(CustomerType.PREMIUM, new PremiumDiscount());
        strategies.put(CustomerType.PARTNER, new PartnerDiscount());
    }


    public DiscountCalculator(Map<CustomerType, DiscountStrategy> strategies) {
        this.strategies.putAll(strategies);
    }

    public double apply(double amount, CustomerType type) {
        DiscountStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Nenhuma tipo de cliente selecionado " + type);
        }
        return strategy.applyDiscount(amount);
    }
}
