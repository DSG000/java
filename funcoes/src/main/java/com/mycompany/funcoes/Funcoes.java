
package com.mycompany.funcoes;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
        System.out.println("digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior = numeros(a,b,c);
        mostrarResultado(maior);
        
       /* if(a> b && a> c) {
            System.out.println("o numero maior é: " + a);
        }else if(b>c){
            System.out.println("o numero maior é: " +b );
        }else {
            System.out.println("o numero maior é: "+ c);
        }*/
    }
       public static int numeros(int x, int y, int z){
          int aux;
          if(x>y && x>z){
              aux = x;
       }else if(y>z){
           aux = y;
       }else {
           aux = z;}
       return aux;
       
      //  sc.close();
       }

        
public static void mostrarResultado(int numMaior){
System.out.println("onumero maior é: " + numMaior);
        
        
        
        
        
        
        
        
        
        
        
    }
}
