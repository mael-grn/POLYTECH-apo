package com.example.apo.tp1;

import java.util.Random;

public class Tableau {
    private int[] elements;
    private int taille;

    public void tri_bulle() {
        int c, d, e;
        for (c = 0; c < taille; c++) {
            for (d = c; d < taille - 1; d++) {
                if (elements[d] > elements[c]) {
                    e = elements[c];
                    elements[d] = elements[c];
                    elements[c] = e;
                }
            }
        }
    }

    public void afficher_tableau() {
        for (int h = 0; h < taille - 1; h++) {
            System.out.print(elements[h] + ", ");
        }
        System.out.println(elements[taille - 1]);
    }

    public Tableau(int n, int v) {
        Random i = new Random();
        taille = n;
        elements = new int[taille];
        int j;
        for (j = 0; j < taille; j++) {
            elements[j] = i.nextInt(v);
        }
    }
}

