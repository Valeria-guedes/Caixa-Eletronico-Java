/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array ");
        int numeros = leia.nextInt();
        
        int tamanho[] = new int[numeros];
        int i;

        for (i = 0; i < tamanho.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            tamanho[i] = leia.nextInt();
        }
             for (i = 0; i < 1; i++) {
            System.out.println("O tamanho do array e : " + numeros);
        }
        
        System.out.print("Array: [");
        for (int y = 0; y < tamanho.length; y++) {
            System.out.printf("%d", tamanho[y]);
            System.out.print(" , ");
        }
        System.out.println("]");
    }

}
