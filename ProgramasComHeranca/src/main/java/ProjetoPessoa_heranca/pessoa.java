
package ProjetoPessoa_heranca;

public class pessoa {
    private String Nome;
    private int Idade;
    private String sexo;
    
    public void fazerAniver(){
        this.Idade ++;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String N) {
        this.Nome = N;
    }

    public void setIdade(int I) {
        this.Idade = I;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "pessoa{" + "Nome=" + Nome + ",Idade=" + Idade + ",sexo=" + sexo + '}';
    }
                                                      
}
