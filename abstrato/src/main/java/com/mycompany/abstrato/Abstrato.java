
package com.mycompany.abstrato;

import java.util.Scanner;

public class Abstrato {

    public static void main(String[] args) {
      
        System.out.println("Sua aula começa as 19!!");
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Digite a hora que voce chegou na aula: ");
        int horario = sc.nextInt();
       

        
        
        abstrato2 a1 = new abstrato2();
        
        a1.chegada = horario;
        a1.horario();  
       
      //  boolean modulo = a1.modulometodo
     
   
      
        
        
        
            
        
        
        
    }
}
