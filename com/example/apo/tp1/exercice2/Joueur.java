package com.example.apo.tp1.exercice2;

import java.time.MonthDay;
import java.util.Random;

public class Joueur implements AyantAnniversaire {

    private String nom;
    private String prenom;
    private final MonthDay dateAnniversaire;
    private final int identifiant;
    private static int compteurIdentifiant = 0;

    public Joueur(String nom, String prenom) {

        Random random = new Random();

        int jourAnniversaire = random.nextInt(1, 29);
        int moisAnniversaire = random.nextInt(1, 13);

        this.nom = nom;
        this.prenom = prenom;
        this.dateAnniversaire = MonthDay.of(moisAnniversaire, jourAnniversaire);
        this.identifiant = compteurIdentifiant;

        compteurIdentifiant ++;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    @Override
    public String toString() {
        return "[" + identifiant + "] " + prenom + " " + nom + " (Anniversaire : " + dateAnniversaire + ")";
    }

    @Override
    public MonthDay getDateAnniversaire() {
        return dateAnniversaire;
    }
}
