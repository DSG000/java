
package carro;


public class carro {
    private String marca;
    private String modelo;
    private int ano;
    
    public carro(String m,String mo, int a){
        this.marca = m;
        this.modelo = mo;
        this.ano = a;
    }
    
    
   public String getMarca(){
       return marca;    
   }
   
    public String getModelo(){
        return modelo;
    }
    
    public int getano(){
        return ano;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
      public void setmodelo(String mo){
          this.modelo = mo;
    }
    
    public void setano(int a){
        this.ano = a;  
    }
    
    
    
    
}
