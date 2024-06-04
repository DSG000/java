
package ProjetoPessoa_heranca;

public class professor extends pessoa{
    private String especialidade;
    private double salario;
    
    
    public void receberAumento (double aum){
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspecialidade(String e) {
        this.especialidade = e;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }
    
}
