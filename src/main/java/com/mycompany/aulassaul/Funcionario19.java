/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulassaul;

public class Funcionario19 {
    
    private String nome;
    private int ID;
    private double salario;


   public void exibir(){
        System.out.printf("O funcionário %s, de número %d recebe %.2f por mês", getNome(),getID(),getSalario());
        System.out.println("");
    }
    public void setNome( String nome ){
        this.nome = nome;
    }  
    public void setID( int ID ){
        this.ID = ID;
    }    
    public void setSalario( double salario ){
        this.salario = salario;
    }    
    public String getNome(){
        return this.nome;
    }    
    public int getID(){
        return this.ID;
    }    
    public double getSalario(){
        return this.salario;
    }    
}

