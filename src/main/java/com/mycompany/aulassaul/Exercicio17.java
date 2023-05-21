/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

/**
 *
 * @author valeria
 */
public class Exercicio17 {
    public static void main(String[] args) {
        
        int i;
        String[] nome = new String[1];
        Scanner leia = new Scanner(System.in);
   
        for (i = 0; i < nome.length; i++) {
              System.out.println("Digite uma frase ");
              nome[i] = leia.nextLine();
        }
          System.out.println( "Frase Digitada :");
          for (i = 0; i < nome.length; i++) {
             System.out.print( "  " + nome[i]);
          }
           System.out.print( " . ");
     }
}
