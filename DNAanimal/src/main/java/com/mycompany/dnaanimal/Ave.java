
package com.mycompany.dnaanimal;

public class Ave extends DNAmae{
    private String corPena;
    
    public void fazerninho(){
        System.out.println("Construir ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aves");
    }
    
}
