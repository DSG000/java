
package com.mycompany.dnaanimal;


public class Peixe extends DNAmae{
    private String corEscama;
    
    public void soltarbolha(){
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("nada");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("Gloop Gloop");
    }
    
}
