
package SwitchCase;
 
import java.util.Scanner;

public class ClassePrincipalOpcao {
    public static void main(String[] args) {
          Scanner leia = new Scanner (System.in);
           
            SuperClasse menu = new SubClasse();
            menu.setNum1(10);
            menu.setNum2(20);
            menu.MostrarOpcao();

      }
    }
        
    



