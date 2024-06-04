

package com.mycompany.revisaofor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Revisaofor {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 10;
      int soma = 0;
      soma = sc.nextInt();
      for(int i = 2; i<=n; i+=2){
          soma+= i;
          
          System.out.println(i);
      }
          System.out.println("A soma dos numeros pares ate " + n + " é: " + soma);
    } 
}
