
package calculadora;

import java.util.Scanner;


public class Calculadora {

 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        int a, b, r;
        
                
        System.out.println("digite um numero para fazer uma soma: ");
        a = sc.nextInt();
        System.out.println("Digite outro numero: ");
        b = sc.nextInt();
        System.out.println("resultado: ");
        r = a + b;
        
        System.out.print(r);
        
        int c, d, r2;
        
         System.out.println("\ndigite um numero para fazer uma subtração");
        c = sc.nextInt();
         System.out.println("Digite outro numero: ");
        d = sc.nextInt();
        System.out.println("resultado: ");
        r2= c - d;
        System.out.print(r2);
        
        int e, f, r3;
        
        System.out.println("\n digite um numero para fazer uma multiplicação");
        e = sc.nextInt();
         System.out.println("Digite outro numero: ");
        f = sc.nextInt();
        System.out.println("resultado: ");
        r3 = e * f;
        
        System.out.print(r3);
        
        
    
    }
    
}
