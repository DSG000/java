
package arvore_hierarquia;


   public class aluno extends pessoa {
   private double matricula;
   private String curso;
   
   public void pagarmensalidade(){
       System.out.println("Pagando mensalidade de aluno ou aluna "+this.nome);
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
   public String detalheAluno(){
       return "matricula: " + matricula+ "\ncursando: "+ curso;
   }
}
