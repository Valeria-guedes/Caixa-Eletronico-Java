package Pessoa;

public class aviao extends veiculo{ // subclasse
    private int categoria;

    public aviao(String nome, int categoria){   // construtor
        super(nome,10); // (super) faz referencia a super classe  
        this.categoria=categoria;
        
    }
    public void mostrar(){
        super.info();// chamando metodo info da super classe
        System.out.printf("mostrar categoaria :%d%n",this.categoria);
        
  }
}
