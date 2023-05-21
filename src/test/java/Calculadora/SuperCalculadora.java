
package Calculadora;
import java.util.Scanner;
public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);       
        int opção;
        
        System.out.println("Digite um numero :");
        double numero1 = leia.nextDouble();
        System.out.println("Digite um segundo numero :");
        double numero2 = leia.nextDouble();
        
        SubCalculadora calcular = new SubCalculadora(numero1,numero2);
        int opçao = 0;

        do {
           
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Finalizar");
            
            System.out.println("Digite a opção desejada:");
            opçao = leia.nextInt();
            switch (opçao) {
                case 1:
                    System.out.println("A soma dos numeros e :" + calcular.Somar());
                    break;
                case 2:
                    System.out.println("A divisão dos numeros e :" + calcular.dividir());                
                    break;
                case 3:
                    System.out.println("A multiplicação dos numeros e :" + calcular.multiplicar());                   
                    break;
                case 4:
                    System.out.println("A subtração dos numeros e :" + calcular.subtrair());
                    break;
                case 0:
                    System.out.println("Finalizado...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opçao !=  0);
    }
}
   


   