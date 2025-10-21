package com.example.apo.tp2.expressions;

public class Entier implements Valeur<Integer> {
    private final int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public Integer getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return Integer.toString(valeur);
    }
}
