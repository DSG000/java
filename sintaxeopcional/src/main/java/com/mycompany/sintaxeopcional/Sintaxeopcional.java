

package com.mycompany.sintaxeopcional;

import java.util.Locale;
import java.util.Scanner;

public class Sintaxeopcional {

    public static void main(String[] args) {
        
      Locale.setDefault(Locale.US);  
      Scanner sc = new Scanner (System.in);
     
     /* 
      int minutos = sc.nextInt();
      double conta = 50.0;
      
      if(minutos > 100){
          conta = conta + (minutos - 100) * 2.0;
      }
        System.out.println("valor da conta = R$" + conta);
        sc.close();
      */
     int numero, multiplicacao;
     numero = sc.nextInt();
     numero +=5;
     System.out.println(numero);
     multiplicacao = sc.nextInt();
     multiplicacao *=2;
        System.out.println(multiplicacao);
        
        
      }
        
   
    }
