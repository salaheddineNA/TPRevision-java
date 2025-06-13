/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author salah
 */
import java.util.Scanner;
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int compteur = 0;

        do {
            System.out.print("Entrez un chiffre : ");
            x = scanner.nextInt();
            compteur++;

            if (x < 12) {
                System.out.println("Valeur plus petite");
            } else if (x > 12) {
                System.out.println("Valeur plus grande");
            } else {
                System.out.println("Vous avez gagné !");
            }

        } while (x != 12);

        System.out.println("Nombre de tentatives : " + compteur);
    }
    
}
