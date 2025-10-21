package com.example.apo.tp2.expressions;

public class Constante implements Expression {
    private final Valeur<?> valeur;

    public Constante(Valeur<?> valeur) {
        this.valeur = valeur;
    }

    @Override
    public Valeur<?> calculer() {
        return valeur;
    }

    @Override
    public String toString() {
        return valeur.toString();
    }


}
