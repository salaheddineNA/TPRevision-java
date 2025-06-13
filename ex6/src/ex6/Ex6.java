/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author salah
 */
import java.util.Scanner;
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
            return;
        }
        
        long factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        
        System.out.println("La factorielle de " + n + " est : " + factorielle);

    }
    
}
