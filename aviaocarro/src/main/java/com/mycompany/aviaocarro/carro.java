
package com.mycompany.aviaocarro;

public class carro {
    private String marca;
    private int anofabri;
    private String modelo; 
    private double kman;
            
    public void Kman(){
        this.kman ++;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnofabri() {
        return anofabri;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKman() {
        return kman;
    }

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public void setAnofabri(int a) {
        this.anofabri = a;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setKman(double k) {
        this.kman = k;
    }

    public String Detalhescarro() {
        return "carro{" + "marca=" + marca + ", anofabri=" + anofabri + ", modelo=" + modelo + ", kman=" + kman + '}';
    }
             public String detalheAvião() {
        return "aviao{" + "marca=" + marca + ", anofabri=" + anofabri + ", modelo=" + modelo + ", kman=" + kman +'}'; 
}
}