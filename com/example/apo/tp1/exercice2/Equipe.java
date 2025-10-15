package com.example.apo.tp1.exercice2;

import java.time.MonthDay;
import java.util.Arrays;
import java.util.Random;

public class Equipe implements AyantAnniversaire {

    private final Joueur[] joueurs;
    private final MonthDay dateAnniversaire;


    public Equipe(int tailleEquipe) {
        Random random = new Random();

        int jourAnniversaire = random.nextInt(1, 29);
        int moisAnniversaire = random.nextInt(1, 13);
        this.dateAnniversaire = MonthDay.of(moisAnniversaire, jourAnniversaire);
        joueurs = new Joueur[tailleEquipe];
    }

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public void init() {
        // On parcours le tableau en entier en créant un nouveau joueur à chaque fois
        for (int i = 0; i < joueurs.length; i++) {
            joueurs[i] = new Joueur("Nom" + i, "Prenom" + i);
        }
    }

    public void addJoueur(Joueur joueur, int position) {
        if (position >= 0 && position < joueurs.length) {
            joueurs[position] = joueur;
        }
    }

    public int compterNombrePaireDeJoueursAvecMemeAnniversaire() {
        // On parcours le tableau en entier en comparant chaque joueur avec les autres
        int nombreJoueursMemeAnniversaire = 0;
        for (int i = 0; i < joueurs.length-1; i++) {
            for (int j = i+1; j < joueurs.length; j++) {
                // Si les dates d'anniversaire sont égales, on incrémente le compteur
                if (joueurs[i].getDateAnniversaire().equals(joueurs[j].getDateAnniversaire())) {
                    nombreJoueursMemeAnniversaire++;
                }
            }
        }
        return nombreJoueursMemeAnniversaire;
    }

    public boolean ilExisteDeuxJoueursMemeAnniversaire() {
        return compterNombrePaireDeJoueursAvecMemeAnniversaire() > 0;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("Equipe pouvant accueillir " + joueurs.length + " joueurs (anniversaire le " + dateAnniversaire + ") : ");
        for (Joueur joueur : joueurs) {
            value.append("\n\t").append(joueur);
        }
        return value.toString();

    }

    @Override
    public MonthDay getDateAnniversaire() {
        return dateAnniversaire;
    }
}
