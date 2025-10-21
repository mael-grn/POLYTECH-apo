package com.example.apo.tp2.expressions;

public class Reel implements Valeur<Double> {
    private final double valeur;

    public Reel(double valeur) {
        this.valeur = valeur;
    }

    public Double getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return Double.toString(valeur);
    }
}
