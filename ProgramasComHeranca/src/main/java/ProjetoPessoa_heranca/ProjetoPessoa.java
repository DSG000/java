 
package ProjetoPessoa_heranca;


public class ProjetoPessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();
        
        p1.setNome("Daniel");
        p2.setNome("Natã");
        p3.setNome("Alex");
        p4.setNome("Sara");
        
        p1.setSexo("faço");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(17);
        p2.setIdade(19);
        p3.setIdade(17);
        p4.setIdade(30);
        
        p2.setCurso("informatica");
        p3.setEspecialidade("Java");
        p4.setSetor("segurança");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());                      
        System.out.println(p4.toString());
        
    }
}
