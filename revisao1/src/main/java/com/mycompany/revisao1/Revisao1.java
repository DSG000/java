
package com.mycompany.revisao1;

public class Revisao1 {

    public static void main(String[] args) {
 /*int limite = aa.nextInt();
        int numero = 2;
        
        do{
            System.out.println(numero);
            numero +=2;
        }while(numero<= limite);
        
        aa.close();*/ 
        
        int soma = 0;
        int contador =0;
        int limite =0;
        
        do{
            contador= sc.nextInt();
        soma += contador;
        contador ++;
            System.out.println(contador);
        }while(contador <= limite); 
            System.out.printf("a soma dos numros até" + limite + " é: " +soma );
        

    }
}