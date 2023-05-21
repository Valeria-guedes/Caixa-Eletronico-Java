/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int i;
        int tamanho = 4;
        int aux;
        int array[] = new int[tamanho];

        for (i = 0; i < tamanho; i++) {
            System.out.print("Digite 4 numeros ");
            array[i] = leia.nextInt();
        }

        System.out.println("desordenados ");
        for (i = 0; i < tamanho; i++) {
            System.out.println(" " + array[i]);
        }
        for (i = 0; i < tamanho; i++) {
            for (int j = 0; j < 3; j++) {
                // 1 < 5 
                if (array[j] < array[j + 1]) { 
                    // aux = 5 
                    aux = array[j];
                    
                    //array[0] = 5
                    array[j] = array[j + 1];
                    //array[1] = 1
                    array[j + 1] = aux;
                }
            }
       }
        
       
       
        System.out.println("ordenados ");
        for (i = 0; i < 4; i++) {
            System.out.println(" " + array[i]);
        }

    }
}
