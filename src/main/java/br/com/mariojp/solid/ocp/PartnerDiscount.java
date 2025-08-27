package br.com.mariojp.solid.ocp;

public class PartnerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.88; // 12% de desconto
    }
}
