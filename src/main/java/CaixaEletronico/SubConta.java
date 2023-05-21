
package CaixaEletronico;
import java.util.Scanner;
public class SubConta {
    private int conta, saque;
    private double saldo;
    private String nome;
    private int idade;
    private String sexo;
    private String naturalidade;
    private double investir;
    private double retirar;

    Scanner entrada = new Scanner(System.in);

    public SubConta(String nome, int conta, double Saldo_Inicial, int idade, String sexo, String naturalidade, double investir, double retirar) {
        this.nome = nome;
        this.conta = conta;
        saldo = Saldo_Inicial;
        saque = 0;
        this.sexo = sexo;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.investir = investir;
        this.retirar = retirar;
        
    }
    public void listar(){
        System.out.println("nome:" + this.nome);
        System.out.println("idade:" + this.idade);
        System.out.println("naturalidade:" + this.naturalidade);
        System.out.println("sexo:" + this.sexo);
    }
    public void investir(){
       System.out.println(" Valor investido " + this.investir );     
    }
    public void retirar(){
           double porcentagem = (10*100)/investir;
            retirar = investir + porcentagem; 
            System.out.println("Valor retirado " + this.retirar); 
            return;
       
    }
    public void extrato() {
        System.out.println("\t Extrato");
        System.out.println("nome: " + this.nome);
        System.out.println("Numero da conta: " + this.conta);
        System.out.printf("Saldo Atual: %2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saque + "\n");
    }

    public void sacar(double valor) {
      
        if (saldo >= valor) {
            saldo = saldo - valor; // saque = saque - valor
            saque++;
            System.out.println("Valor Sacado " + valor);
            System.out.println("Novo saldo: " + saldo);
            return;
        } else {
            System.out.println("saldo insuficiente,faça um deposito!");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor; 
        System.out.println("valor depositado: " + saldo);
        System.out.println("novo saldo: " + saldo);

    }

    public void iniciar() {
        int opcao;
        do {
            ExibeMenu();
            opcao = entrada.nextInt();
            EscolhendoOpcao(opcao);
        } while (opcao != 4);
    }

    public void ExibeMenu() {
        System.out.println("\t Escolha a opção desejada ");
        System.out.println("[1] Extrato");
        System.out.println("[2] Sacar");
        System.out.println("[3] Depositar");
        System.out.println("[4] Listar");
        System.out.println("[5] Investir");
        System.out.println("[6] Retirar");
        System.out.println("[0] Sair \n");
        System.out.println("Opção:");
    }

    public void EscolhendoOpcao(int opcao) {
        double valor = 0;

        switch (opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if (saque < 5) {
                    System.out.print("Quanto Deseja Sacar ?");
                    valor=entrada.nextDouble();
                    this.sacar(valor);
                } else {
                    System.out.println("limite de saques diarios atingidos\n");
                }
            case 3:
                System.out.println("Quanto deseja Depositar ?");
                valor = entrada.nextDouble();
                depositar(valor);
                break;
            case 4:
                this.listar();
                break;
            case 5:
                System.out.println(" Qual valor deseja investir " );
                investir=entrada.nextDouble();
                this.investir();
                break;
            case 6:
                this.retirar();
                break;
            case 0:
                System.out.println("Sistema Finalizado");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}


