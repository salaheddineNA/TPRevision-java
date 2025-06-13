/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author salah
 */
import java.util.Scanner;

public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("entrez la valeur de a : ");
        int a=sc.nextInt();
        
        System.out.print("entrez la valeur de b : ");
        int b=sc.nextInt();
        
        System.out.print("entrez la valeur de c : ");
        int c=sc.nextInt();
        
        System.out.println("Avant permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        int temp = a;
        a = b;
        b = c;
        c = temp;
        
        System.out.println("Après permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    
}
