
package ProjetoPessoa_heranca;

public class funcionario extends pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String st) {
        this.setor = st;
    }

    public void setTrabalhando(boolean t) {
        this.trabalhando = t;
    }
    
}
