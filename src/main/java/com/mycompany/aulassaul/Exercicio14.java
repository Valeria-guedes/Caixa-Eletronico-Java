/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class Exercicio14 {
     public static void main(String[] args) {
         int [] numeros = new int [10];
        int i;
        Scanner leia = new Scanner(System.in);
   
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite 10 numeros ");
            numeros[i] = leia.nextInt();
        }
           
        System.out.println("Os Numeros Digitados Acrescidos de 5 são : ");
        for (int y = 0; y < numeros.length; y++) {
         System.out.println(numeros[y] + 5);
        }
         
     }
    
}
