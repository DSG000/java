
package arvore_hierarquia;


public class pessoa {
 protected String nome;
 private int idade;
 private String sexo;

    public String detalhePessoa() {
        return "pessoa " + "nome: " + nome + "\nidade: " + idade + "\nsexo: " + sexo + '.';
    }
 
 
 
 public void fazeraniversario(){
     this.idade ++;
 }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

 
    }

 

