
package com.mycompany.valoraocubo;

import java.util.Scanner;


public class Valoraocubo {

    public static void main(String[] args) {
       
           Scanner sc = new Scanner(System.in);
           System.out.println("digite o valor para fazer uma conta ao cubo");
           double numero = sc.nextInt();
           double num1 = cubo(numero);
           System.out.println("seu resultado é: "+ cubo(numero));
               }
        
public static double cubo(double numero){
return (double) Math.pow(numero, 3);
}}

