package SwitchCase;
public class SuperClasse {
    
  int opcao;
  int num1;
  int num2;
  
  public SuperClasse(){ // construtor 
      this.num1=10;
      this.num2=20;
      this.opcao=0;
  } 
    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int num1){
        this.num1 = num1 ;
    }
    public int getNum2(){
        return this.num1;
    }
    public void setNum2(int num2){
        this.num2 = num2 ;
    }
     public int getOpcao(){
        return this.opcao;
    }
    public void setOpcao(int opcao){
        this.opcao = opcao ;
    }
    // metodos abstratos
    public void MostrarOpcao(){
        

            switch (this.opcao) {
                case 1:
                    System.out.println("Resultado da opção " + this.num1);
                    break;
                case 2:
                        System.out.println("Resultado da opção " + this.num2);
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
        
            
            }
    }
}
        
       
        



