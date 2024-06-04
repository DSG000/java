

package com.mycompany.olamundo1;

import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class OlaMundo1  {

    public static void main(String[] args) {
       
        String nome = "daniel";
        int idade = 16;
        double renda = 15.234;
        System.out.println(nome + " tem "  + idade + " de idade e ganha " + renda);
        Locale.setDefault(Locale.US);
        System.out.printf("%S tem %d e tem uma renda de %.3f",nome, idade,renda);
        
        /* %f - ponto flutuante (float, double)   
           %d - numeros inteiros (int)
           %s - texto (string)
        */
        /*
        /*double x= 10.356547;
        System.out.println(x);
        System.out.printf("%.2f\n",x);  
        System.out.printf("%.4f\n" ,x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.0f\n",x);
        System.out.println("RESULTADO= " + x + " METROS");    
        System.out.printf("RESULTADO= %.2f METROS\n",x);
            
         */
        
        
           
     }
    
}
