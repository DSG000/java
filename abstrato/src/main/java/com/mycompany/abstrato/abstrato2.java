package com.mycompany.abstrato;

import java.util.Scanner;

public class abstrato2 {

    int chegada;
    int duração;
    String modulo;
    Scanner sc2 = new Scanner(System.in);

    void horario() {
        if (chegada <= 19) {
            System.out.println("Digite o modulo que voce esta: ");
            System.out.println("Voce chegou na hora!!");
            System.out.println("Informações sobre a aula de hoje:");
            System.out.println("Duração da aula" + this.duração);
            System.out.println("Voce esta no modulo" + this.modulo);
            String modulo = sc2.nextLine();
        } else if (chegada <= 19) {
            System.out.println("Sua aula ainda não começou!");
        } else if (chegada >= 22) {
            System.out.println("Sua aula ja acabou ");
        } else if(chegada > 19 && chegada<22){
            System.out.println("Voce esta em aula ");  
        }else {
            System.out.println("Sua aula ainda não começou.");
        }
    }
    
        void status(){
            System.out.println("Informações sobre a aula de hoje:");
            System.out.println("Duração da aula" + this.duração);
            System.out.println("Voce esta no modulo" + this.modulo);
        }

    
}
