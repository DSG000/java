
package com.mycompany.dnaanimal;

public class Cachorro extends Mamifero {
    public void abanarRabo(){
        System.out.println("Ele está feliz");
    }
    public void EnterrarOsso(){
        System.out.println("Enterrando Osso");
    }
     @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ração");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au");
}
}