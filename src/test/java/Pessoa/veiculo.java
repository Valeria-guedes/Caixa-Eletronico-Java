package Pessoa;
public class veiculo { // superclasse
     private String nome; // private usados apenas dentro da propria classe 
     private int tipo;
     
     public veiculo(String nome,int tipo){ // construtor 
         this.nome = nome;  // referenciando os metodos para chamar na subclasse
         this.tipo = tipo;
         
     }
     public void info(){
         System.out.printf("Nome :%s%n",this.nome);
         System.out.printf("Tipo :%d%n",this.tipo);
     }
}
