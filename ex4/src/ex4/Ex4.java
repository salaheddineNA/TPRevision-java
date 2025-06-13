/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author salah
 */
import java.util.Scanner;

public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();
        
        System.out.print("Entrez votre sexe (1 : Femme, 2 : Homme) : ");
        int sexe = scanner.nextInt();
        
        if (sexe == 2 && age > 20) {
            System.out.println("Vous devez payer l'impôt.");
        } else if (sexe == 1 && age >= 18 && age <= 35) {
            System.out.println("Vous devez payer l'impôt.");
        } else {
            System.out.println("Vous ne payez pas d'impôt.");
        }
    }
    
}
