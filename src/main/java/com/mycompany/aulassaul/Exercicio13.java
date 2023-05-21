/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        int[] nome = new int[4];
        int i;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < nome.length; i++) {
            System.out.println(" digite um numero:  ");
            nome[i]=leia.nextInt();

        } System.out.println("Os numeros digitados são : ");
         for (int y = 0; y < nome.length; y++) {
         System.out.print(nome[y]+" / ");
        }
        
    }
}
