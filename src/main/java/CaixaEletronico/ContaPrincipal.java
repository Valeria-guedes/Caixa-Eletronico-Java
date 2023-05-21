
package CaixaEletronico;
import java.util.Random;
import java.util.Scanner;

public class ContaPrincipal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome,sexo;
        String naturalidade ;
        int idade;
        double saldo;
        double investir = 0;
        double retirar = 0;
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
       
        System.out.println("Caixa");
        System.out.println("Seja bem vindo!! ");
        System.out.println("Digite  seu nome :");
        nome = entrada.nextLine();
        System.out.println("Digite sua Naturalidade:");
        naturalidade = entrada.nextLine();
        System.out.println("Informe seu sexo :");
        sexo  = entrada.nextLine();
        System.out.println("Digite  sua idade :");
        idade = entrada.nextInt();
    
        System.out.println("Entre com o valor inicial para deposito em conta:");
        saldo = entrada.nextDouble();
        
        SubConta MinhaConta = new SubConta (nome,conta,saldo,idade,sexo,naturalidade,investir,retirar);
        MinhaConta.iniciar();
        
    
    }
}
    



