
package com.mycompany.dnaanimal;


public class Tartaruga extends Reptil{
    public void entrarCasco(){
        System.out.println("Se escondeu no casco ");
    
    }
     @Override
    public void locomover() {
        System.out.println("Anda de skate");
    }

    @Override
    public void alimentar() {
        System.out.println("Pizza");
    }

    @Override
    public void emitirSom() {
        System.out.println("COWABUNGA!");
    }
    }
