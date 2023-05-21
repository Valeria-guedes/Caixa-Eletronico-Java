/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class capgemini {

    public static void main(String[] args) {
        int valores = 4;
        int i;
        int maior = 0;
        int menor = 100000;
        int soma = 0;
        int subtracao = 0;
        int valor[] = new int[valores];
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < valores; i++) {
            System.out.println("digite um numero ");
            valor[i] = leia.nextInt();
            soma = soma + valor[i];
        }
        for (i = 0; i < valores; i++) {
            if (valor[i] > maior) {
                maior = valor[i];
            }
            if (valor[i] < menor) {
                menor = valor[i];
            }
        }
        for (i = 0; i < valores; i++) {
            subtracao = soma - 1000;
        } 
        System.out.println("Os valores digitados são");
        for (i = 0; i < valores; i++) {
            System.out.print(valor[i] + ",");
        }
         System.out.println("\n");
        System.out.println(soma);
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(subtracao);

    }
}
