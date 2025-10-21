package com.example.apo.tp2.expressions;

public class Soustraction extends ExpressionBinaire {

    public Soustraction(Expression e1, Expression e2) {
        super(e1, e2);
    }

    /**
     * Calcul la soustraction de deux expressions
     * @return la valeur résultante de la soustraction, soit un Entier soit un Reel
     */
    @Override
    public Valeur<?> calculer() {
        Valeur<?> v1 = expression1.calculer();
        Valeur<?> v2 = expression2.calculer();

        //Si c'est des entier on calcul en tant qu'entier
        if (v1 instanceof Entier i1 && v2 instanceof Entier i2) {
            int res = i1.getValeur() - i2.getValeur();
            return new Entier(res);
        }

        double res = v1.getValeur().doubleValue() - v2.getValeur().doubleValue();
        return new Reel(res);
    }

    @Override
    public String toString() {
        return "(" + expression1.toString() + "-" + expression2.toString() + ")";
    }
}
