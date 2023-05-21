/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;
import java.util.Scanner;
public class Exercicio19 {
     public static void main(String[] args) {
        
        String nome;
        int ID ;
        int salario ;
        
        Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite seu nome ");
        nome = leia.nextLine();
         
        System.out.print("Digite seu ID");
        ID = leia.nextInt();
         
        System.out.print("Digite seu salario ");
        salario = leia.nextInt();
        

        Funcionario19 chefe = new Funcionario19();

        chefe.setNome(nome);
        chefe.setID(ID);
        chefe.setSalario(salario);
        chefe.exibir();
    }
}


