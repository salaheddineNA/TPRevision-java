/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author salah
 */
import java.util.Scanner;
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enterz le prix HT d'un article :");
        float prixHT=sc.nextFloat();
        
        System.out.print("enterz le nombre d'article :");
        int qu=sc.nextInt();
        
        System.out.print("enterz le taux de TVA :");
        float tva=sc.nextFloat();
        
        float tttc =(prixHT * qu)*(1 + tva / 100);
        
        
        System.out.printf("prix total TTC est :" + tttc + "dh");
    }
    
}
