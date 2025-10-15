package com.example.apo.tp1.exercice1;

import java.util.Random;

public class Tableau {
    private final int[] elements;
    private final int taille;

    public void tri_bulle() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille - 1; j++) {
                //Si l'élément courant est plus grand que le suivant, on les permute
                if (elements[j] > elements[j+1]) {
                    int elementTemp = elements[j+1];
                    elements[j+1] = elements[j];
                    elements[j] = elementTemp;
                }
            }
        }
    }

    public void afficher_tableau() {
        for (int i = 0; i < taille - 1; i++) {
            System.out.print(elements[i] + ", ");
        }
        System.out.println(elements[taille - 1]);
    }

    public Tableau(int taille, int borne_sup) {
        Random random = new Random();
        // Initialisation de la taille du tableau
        this.taille = taille;
        // Initialisation du tableau avec la taille correspondante
        elements = new int[this.taille];
        // Remplissage du tableau avec des valeurs aléatoires
        for (int i = 0; i < this.taille; i++) {
            elements[i] = random.nextInt(borne_sup);
        }
    }
}

