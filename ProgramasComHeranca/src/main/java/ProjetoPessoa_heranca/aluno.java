
package ProjetoPessoa_heranca;

public class aluno extends pessoa{
    private double matricula;
    private String curso;
    
    
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public double getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(double m) {
        this.matricula = m;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
    
}
