
package com.mycompany.dnaanimal;


public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }
     @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public void alimentar() {
        System.out.println("Planta e fungos");
    }

    @Override
    public void emitirSom() {
        System.out.println("É É É É É É");
    }
}
