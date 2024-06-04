 
package com.mycompany.ame;

import java.util.Scanner;

public class Canetas {
   String marca;
   String cor;
   double ponta;
   int carga;
   boolean tampada;
   
   void estado(){
       System.out.println("Informações da caneta ");
       System.out.println("cor: " + this.cor);
       System.out.println("Marca: " +this.marca); 
       System.out.println("ponta: " +this.ponta);
       System.out.println("carga: " +this.carga);
       System.out.println("Ela está tampada? " + (this.tampada ?"Sim" : "Não"));
   }
   void escrever(){ 
       if(this.tampada == true){
           System.out.println("Esta tamapada!!! Não posso escrever\n");
       }else{
           System.out.println("Esta destampada!!! Agora posso escrever\n");
       }
   }
   void tampar(){
       this.tampada = true;
   }
   void destampar(){     
       this.tampada = false;
    }
   void carga(){
   }
   boolean perguntarTampada(){
       Scanner sc = new Scanner(System.in);
       System.out.println("A caneta esta tampada?  (Sim/Não)");
       String resposta = sc.nextLine();
       if(resposta.equals("Sim")){
           return true;
       }else if (resposta.equals("Não") || resposta.equals("nao")){
           return false;
   }else{
            System.out.println("RESPOSTA INVALIDA!!! \n DIGITE SIM OU NÃO");
            return perguntarTampada();
       }
   }
}