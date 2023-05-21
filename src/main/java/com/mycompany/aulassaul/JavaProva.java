/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

import java.util.Scanner;

public class JavaProva {

    public static void main(String[] args) {


        String[] nome = new String[4];
        int i;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < nome.length; i++) {
            System.out.println("digite 4 palavras ");
            nome[i] = leia.nextLine();
        }
        System.out.println("As palavras são ");
        for (i = 0; i < nome.length; i++) {
            System.out.print(nome[i]+ ",");
           
        }

    }

}
