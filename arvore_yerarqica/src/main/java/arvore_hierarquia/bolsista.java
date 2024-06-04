
package arvore_hierarquia;


public class bolsista extends aluno{
    private double bolsa;
    
    public void renovarbolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);
}
   @Override
    public void pagarmensalidade(){
        System.out.println(this.nome + " é bolsista pagamento facilitado");
}
}
