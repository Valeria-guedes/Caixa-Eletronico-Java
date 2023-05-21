
package Carros;

import java.util.Scanner;

public class ClasseExecultadora {
    public static void main(String [] args){
        Scanner leia = new Scanner (System.in);
        String nome;
        String cor;
        int velocidade;
        int ano;
        String modelo;
        
        System.out.println(" digite seu nome");
        nome=leia.nextLine();
        System.out.println("digite a cor do carro");
        cor=leia.nextLine();
        System.out.println("qual sua velocidade " );
        velocidade=leia.nextInt();
        System.out.println("qual o ano do " );
        ano=leia.nextInt();
        System.out.println("qual o modelo do carro " );
        modelo=leia.nextLine();
        
        Carro fox = new Carro();
        fox.setNome(nome);
        fox.setCor(cor);
        fox.setAno(ano);
        fox.setNome(velocidade);
        
        fox.mostrar();
       
        
       
        
    }
} 
  

