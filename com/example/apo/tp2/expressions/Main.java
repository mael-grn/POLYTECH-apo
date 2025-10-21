package com.example.apo.tp2.expressions;

public class Main {
    static void main() {
        System.out.println("Calcul de 3*4+2ˆ-1 :");

        Entier un = new Entier(1);
        Entier deux = new Entier(2);
        Entier trois = new Entier(3);
        Entier quatre = new Entier(4);

        Constante constanteUn = new Constante(un);
        Constante constanteDeux = new Constante(deux);
        Constante constanteTrois = new Constante(trois);
        Constante constanteQuatre = new Constante(quatre);

        Multiplication multiplication = new Multiplication(constanteTrois, constanteQuatre);
        Inverse inverse = new Inverse(constanteDeux);
        Addition addition = new Addition(multiplication, inverse);

        System.out.println("Affichage de l'expression : " + addition);
        System.out.println("Evaluation de l'expression : " + addition.calculer());
    }
}
