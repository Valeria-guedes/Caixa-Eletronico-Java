/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class NewClass {
     public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
 int tamanho = 4 ;
 int indice;
 int maior = 0;
 int menor = 100000;
 int soma = 0;
 int subtracao = 0;
 int array[] = new int[tamanho];
 for (indice = 0; indice < tamanho; indice++) {
 System.out.println("Digite 12 numeros alternados:");
 array[indice] = leia.nextInt();
 soma = soma + array[indice];
 }
 for (indice = 0; indice < tamanho; indice++) {
 if (array[indice] > maior) {
 maior = array[indice];
 }
 if (array[indice] < menor) {
 menor = array[indice];
 }
 }
 System.out.println("Os numeros digitados são :");
 for (indice = 0; indice < tamanho; indice++) {
 subtracao = soma - 1000;
 System.out.print(" " + array[indice] + "\n");
 }
 System.out.println(" Maior numero:" + maior);
 System.out.println(" Menor numero: " + menor);
 System.out.println("A soma dos valores digitados e:" + soma);
 System.out.println(" O valor da soma subtraida por 1000 e igual a: " + subtracao);
 }
}


