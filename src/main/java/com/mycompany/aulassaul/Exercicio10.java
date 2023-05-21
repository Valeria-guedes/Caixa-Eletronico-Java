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
public class Exercicio10 {

    public static void main(String[] args) {
      
        String[] nome = new String[4];
        int i;
        Scanner leia = new Scanner(System.in);
   
        for (i = 0; i < nome.length; i++) {
            System.out.print("Digite a palavra ");
            nome[i] = leia.nextLine();
        }
           
        System.out.println("As palavras são : ");
        for (int y = 0; y < nome.length; y++) {
         System.out.println(nome[y]);
        }
    }
}

