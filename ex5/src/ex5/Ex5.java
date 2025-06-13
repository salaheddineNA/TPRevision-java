/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author salah
 */
import java.util.Scanner;
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre de départ : ");
        int nombre = scanner.nextInt();
        
        System.out.println("Les 10 nombres suivants sont :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + i);
        }
    }
    
}
