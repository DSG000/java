
package pessoa;



public class pessoa {
    private String nome;
    private int idade;
    
    
    public pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }
    
    public String getNome(){
        return nome; 
    }
    public int getidade(){
        return idade;
    }
    
    public void setNome( String n ){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
}
