package com.mycompany.switchcase;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
   //     int hora;

    //    System.out.println("digite um numero de 1 a 4");
      //  hora = sc.nextInt();
/*
        switch (hora) {
            case 1:
                System.out.println("dia da semana: domingo ");
                break;
            case 2:
                System.out.println("dia da semana: segunda");
                break;
            case 3:
                System.out.println("dia da semana: terça-feira");
                break;
            case 4:
                System.out.println("dia da semana: quarta-feira");
                break;
            case 5:
                System.out.println("dia da semana: quinta-feira");
                break;
            case 6:
                System.out.println("dia da semana: sexta");
                break;
            case 7:
                System.out.println("dia da semana: sábado");
                break;
            default:
                System.out.println("VALOR INVALIDO!!! ");
                break;*/
    
   /* switch (hora)    {
        case 1:
            System.out.println("verão");
            break;
        case 2:
            System.out.println("inverno");
            break;
        case 3:
            System.out.println("outono");
            break;
        case 4:
            System.out.println("primavera");
            break;
            */    
   /*
   switch (hora) {
       case 1:
           System.out.println("janero");
           break;
       case 2:
           System.out.println("fevereiro");
           break;
       case 3:
           System.out.println("março");
           break;
       case 4:
           System.out.println("abril");
           break;
       case 5:
           System.out.println("maio");
           break;
       case 6:
           System.out.println("junho");
           break;
       case 7:
           System.out.println("julho");
           break;
       case 8:
           System.out.println("agosto");
           break;
       case 9:
           System.out.println("setembro");
           break;
       case 10:
           System.out.println("outubro");
           break;
       case 11:  
           System.out.println("novembro");
           break;
       case 12:
           System.out.println("dezembro");
           break;          */   
   
   Scanner sc = new Scanner(System.in);
   char letra;
   
   
        System.out.println("digite qualquer letra");
        letra = sc.next().charAt(0);
        
        switch (letra) {   
            case 'A':
                System.out.println("esta letra é uma vogal");
                break;
            case 'a':
                System.out.println("esta letra é uma vogal");
                break;
            case'e':
                System.out.println("esta letra é uma vogal");
                break;
            case 'E':
                System.out.println("esta letra é uma vogal");
                break;
            case 'i':
                System.out.println("esta letra é uma vogal");
                break;
            case 'I':
                System.out.println("esta letra é uma vogal");
                break;
            case 'o':
                System.out.println("esta letra é uma vogal");
                break;
            case 'O':
                System.out.println("esta letra é uma vogal");
                break;
            case 'u':
                System.out.println("esta letra é uma vogal");
                break;
            case 'U':
                System.out.println("esta letra é uma vogal");
                
            default:
                System.out.println("esta letra é uma consoante");
                break;
                        
                   
                    
        }
   
   
   
    }
}
  