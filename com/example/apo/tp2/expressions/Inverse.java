package com.example.apo.tp2.expressions;

public class Inverse implements Expression {
    private final Expression expression;

    public Inverse(Expression e) {
        this.expression = e;
    }

    @Override
    public Reel calculer() {
        Valeur<?> v = expression.calculer();
        double nombre = v.getValeur().doubleValue();
        return new Reel(1.0/nombre);
    }

    @Override
    public String toString() {
        return expression.toString() + "^-1";
    }
}
