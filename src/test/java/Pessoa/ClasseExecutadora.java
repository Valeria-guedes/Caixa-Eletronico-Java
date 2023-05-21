
package Pessoa;
public class ClasseExecutadora {
    public static void main (String [] args ){
        aviao v1 = new aviao("voador",99); // nome e categoria da subclasse aviao
       // v1.info(); // chamando o metodo veiculo dentro da superclasse (nome e tipo)
        v1.mostrar();// mostra td que esta dentro da subclasse aviao dentro da classe mostrar
    }
    
    
}
