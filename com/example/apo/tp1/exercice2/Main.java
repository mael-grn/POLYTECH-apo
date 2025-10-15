package com.example.apo.tp1.exercice2;

public class Main {

    static void main() {

        Equipe equipe = new Equipe(100);
        equipe.init();
        System.out.println(equipe);
        System.out.println("Il existe deux joueurs avec le même anniversaire : " + equipe.ilExisteDeuxJoueursMemeAnniversaire());

        //Pour afficher la proba empirique d'avoir deux joueurs avec la meme date d'anniversaire dans une même équipe, il faut divisier le nombre de paire de joueurs ayant la même date d'anniversaire par le nombre de paire de joueurs possible.

         int nombrePaireJoueursMemeAnniversaire = equipe.compterNombrePaireDeJoueursAvecMemeAnniversaire();
         int nombrePaireJoueursPossible = (equipe.getJoueurs().length * (equipe.getJoueurs().length - 1)) / 2;
         double probaEmpirique = (double) nombrePaireJoueursMemeAnniversaire / nombrePaireJoueursPossible;

        System.out.println("Proba empirique d'avoir deux joueurs avec la même date d'anniversaire dans une même équipe : " + probaEmpirique);
    }
}
