
package pessoa;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        
        pessoa p = new pessoa (nome, idade);
        
        System.out.println("Nome: "+ p.getNome());
        System.out.println("Idade: "+ p.getidade());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }
}
