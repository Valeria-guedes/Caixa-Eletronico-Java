/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        int[] numeros = new int[4];
        int i;
        int soma = 0;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite 10 numeros ");
            numeros[i] = leia.nextInt();
        }
        for (int y = 0; y < numeros.length; y++) {
            soma = soma + ( numeros[y] + 5) ;
        }
         System.out.println("A soma total dos numeros digitados e acrescidos de 5 e :  ");
         System.out.print("  " + soma);
       }
}
