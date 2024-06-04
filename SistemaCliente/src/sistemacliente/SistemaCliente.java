
import java.util.Scanner;




public class SistemaCliente {

 
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String nome, endereco; 
        double cpf;
        int idade;
        char genero;
        
        System.out.println("digite um numero  ");
        nome = sc.nextLine();
        System.out.println(" 1 ");
        endereco = sc.nextLine();
        System.out.println("digite seu CPF: ");
        cpf = sc.nextDouble();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite seu sexo: ");
        genero = sc.next().charAt(0);
        
        System.out.println("nome da cliente: ");
        System.out.println(nome);
        System.out.println("endereço da cliente: ");
        System.out.println(endereco);
        System.out.println("CPF da cliente: ");
        System.out.println(cpf);
        System.out.println("Idade da cliente: ");
        System.out.println(idade);
        System.out.println("genero da cliente (f/m)");
        System.out.println(genero);
        
        
                
        
        
               
        
    }
    
}
