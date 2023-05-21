
package Carros;
public class Carro {
  private String nome; // atributo
  private String cor;
  private int ano;
  private int velocidade;
  
  public Carro(){}
  
  // public Carro(String nome,String cor,int ano,int velocidade){ // parametro
     // this.nome=nome;
    //  this.cor=cor;
     // this.ano=ano;
    //  this.velocidade=velocidade;
  // }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
      this.nome=nome;
  }
  public String getCor(){
    return this.cor;
  }
  public void setCor(String cor){
      this.cor=cor;
  }
  public int getAno(){
    return this.ano;
  }
  public void setAno(int ano){
      this.ano=ano;
  }
  public int getVelocidade(){
    return this.velocidade;
  }
  public void setNome(int velocidade){
      this.velocidade=velocidade;
  }
  

  public void mostrar(){
      System.out.println("    ");
      System.out.printf("nome:%s%n " ,this.nome);
      System.out.printf("cor:%s%n" ,this.cor);
      System.out.printf("ano:%d%n" ,this.ano);
      System.out.printf(" velocidade: %d por hora" , this.velocidade );
  
      
  }
}
