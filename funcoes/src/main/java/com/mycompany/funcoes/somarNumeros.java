
package com.mycompany.funcoes;

import java.util.Scanner;


public class somarNumeros{
        public static void main(String[] args) {
        
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite o primeiro numero: ");
            int num1 = sc.nextInt();
            
            System.out.println("Digite o segundo numero: ");
            int num2 = sc.nextInt();   
            
            System.out.println("A soma é: " + soma (num1, num2));
            
        }
        
         public static int soma(int num1, int num2){
          return num1+num2;   
             
         }
             
            
}
