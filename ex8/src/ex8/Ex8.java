/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author salah
 */
import java.util.Scanner;
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];

        // 2. Remplissage du tableau
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez la valeur à l'index " + i + " : ");
            tableau[i] = scanner.nextInt();
        }

        // 3. Affichage des valeurs
        System.out.println("\nValeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }

        // 4. Calcul de la somme
        int somme = 0;
        for (int val : tableau) {
            somme += val;
        }

        // 5. Recherche de la plus grande valeur
        int max = tableau[0];
        for (int val : tableau) {
            if (val > max) {
                max = val;
            }
        }

        // 6. Recherche de la plus petite valeur
        int min = tableau[0];
        for (int val : tableau) {
            if (val < min) {
                min = val;
            }
        }

        // Affichage des résultats
        System.out.println("\n\nSomme des valeurs : " + somme);
        System.out.println("Plus grande valeur : " + max);
        System.out.println("Plus petite valeur : " + min);
    }
    
}
