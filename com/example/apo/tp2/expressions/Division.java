package com.example.apo.tp2.expressions;

public class Division extends ExpressionBinaire {

    public Division(Expression e1, Expression e2) {
        super(e1, e2);
    }

    /**
     * Calcul la division de deux expressions
     * @return la valeur résultante de la division, un Reel
     */
    @Override
    public Reel calculer() {
        Valeur<?> v1 = expression1.calculer();
        Valeur<?> v2 = expression2.calculer();

        double nombre1 = v1.getValeur().doubleValue();
        double nombre2 = v2.getValeur().doubleValue();
        return new Reel(nombre1/nombre2);
    }

    @Override
    public String toString() {
        return "(" + expression1.toString() + "/" + expression2.toString() + ")";
    }
}
