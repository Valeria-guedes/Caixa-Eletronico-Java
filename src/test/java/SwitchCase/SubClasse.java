
package SwitchCase;
import java.util.Scanner;
public class SubClasse extends SuperClasse{
    
    private int cont=3 ;
    
    public int getCont(){
        return this.cont;
        
    }
    public void setCont(int cont){
        this.cont=cont;
    }
    @Override
    public void MostrarOpcao(){
        Scanner leia = new Scanner(System.in);
        
           do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - voltar ao menu");
            System.out.println("0 - Sair");
            
             this.setOpcao(leia.nextInt());
             
            switch (this.opcao) {
                case 1:
                    System.out.println("Resultado da opção " + this.num1);
                    break;
                case 2:
                        System.out.println("Resultado da opção " + this.num2);
                    break;
                case 3 :System.out.println("escolher outra opção" + this.cont);
                break;
                 case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                }
        } while (opcao !=  0);
            
            }
     }

