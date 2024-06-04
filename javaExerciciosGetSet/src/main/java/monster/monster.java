
package monster;


public class monster {
    private String monster;
    private String sabor;
    private double valor;
   
    
    
    public monster(String s, double v){
        this.sabor = s;
        this.valor = v;
    }
   public String getmonster(){
         return monster;
     }
     public String getsabor(){
         return sabor;
    }
     public double getvalor(){
         return valor;                                                                                                                                                  
     }
     public void setmonster(String m){
         this.monster = m;
     }
     public void setsabor(String s){
         this.sabor = s;
     }
     public void setvalor(double v){
         this.valor = v;
     }
}
