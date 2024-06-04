
package com.mycompany.dnaanimal;


public abstract class DNAmae {
    /* private String membros;
    private int idade;
    private int peso;
    
    public void locomover(){*/
    
        protected double peso;
        protected int idade;
        protected int membro;
    //    protected String corPelo;
        
        public abstract void locomover();
        public abstract void alimentar();
        public abstract void emitirSom();
                 

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembro() {
        return membro;
    }
    /*
    public String getCorPelo() {
    return corPelo;
    }*/

    public void setPeso(double p) {
        this.peso = p;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setMembro(int m) {
        this.membro = m;
    }

    public void setCorPelo(String cp) {
  //      this.corPelo = cp;
    }

  
    public String dadosAnimal() {
        return "animal\n" + "peso=" + peso + "\nidade=" + idade + "\nmembro=" + membro + '.';
    }
    
    }

