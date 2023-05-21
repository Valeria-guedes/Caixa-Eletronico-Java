
package Carros;

public class Celta extends Carro {
    
    private String modelo;
    
    public  Celta(){}
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(){
        this.modelo=modelo;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("modelo "+this.modelo);
    }
}    
