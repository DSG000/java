
package com.mycompany.controleremoto;

public class Controleremoto implements controlador {
private int volume;
private boolean ligado;
private boolean passandoprograma;

public Controleremoto(){
    this.volume = 50;
    this.ligado = true;
    this.passandoprograma = false;
    
}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isPassandoprograma() {
        return passandoprograma;
    }

    public void setPassandoprograma(boolean passandoprograma) {
        this.passandoprograma = passandoprograma;
    }

    @Override
    public void ligar() {
this.setLigado(true);        
    }

    @Override
    public void desligar() {
        this.setLigado(false); 
    }

    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisvolume() {
    }

    @Override
    public void menosvolume() {
    }

    @Override
    public void ligarmudo() {
    }

    @Override
    public void desligarmudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
   
}
