

package arvore_hierarquia;

public class arvorehierarquica {
    public static void main(String[] args) {
        /*        pessoa p1 = new pessoa();
        
        aluno a1 = new aluno();
        a1.setNome("Daniel");
        a1.setMatricula(1234567);
        a1.setCurso("informatica");
        a1.setIdade(17);
        a1.setSexo("M");
        System.out.println(a1.detalhePessoa());
        System.out.println(a1.detalheAluno());
        a1.pagarmensalidade();
        
        visitante v1 =  new visitante();
        v1.setNome("marcia");
        v1.setIdade(42);
        v1.setSexo("F");
        System.out.println(v1.detalhePessoa());*/
        
        bolsista b1 = new bolsista();
        b1.setNome("Irineu");
        b1.setIdade(23);
        b1.setSexo("M");
        b1.setMatricula(534002);
        b1.setCurso("informatica");
        b1.pagarmensalidade();
        b1.renovarbolsa();
        System.out.println(b1.detalhePessoa());
        System.out.println(b1.detalheAluno());
    }
}
