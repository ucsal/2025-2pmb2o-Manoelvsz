package br.com.mariojp.solid.ocp;

public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% de desconto
    }
}
