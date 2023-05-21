
package Calculadora;
public class SubCalculadora {
    public double numero1;
    public double numero2;
    
    public SubCalculadora(double numero1,double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
     }
    
    public double Somar(){
        return numero1 + numero2;
    }
    public double subtrair(){
        return numero1 - numero2;
    }
    public double multiplicar(){
        return numero1 * numero2;
    }
    public double dividir(){
        return numero1 / numero2;
    }
}
