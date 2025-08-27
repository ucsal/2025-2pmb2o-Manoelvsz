package br.com.mariojp.solid.ocp;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95; // 5% de desconto
    }
}
