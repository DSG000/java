
package com.mycompany.aviaocarro;

public class Aviaocarro {

    public static void main(String[] args) {
   carro c1 = new carro();
   c1.setMarca("BMW");
   c1.setAnofabri(2016);
   c1.setModelo("X1");
   c1.setKman(500);
   System.out.println(c1.Detalhescarro());
   
   aviao a1 = new aviao();
   a1.setMarca("gol");
   a1.setAnofabri(2007);
   a1.setModelo("golpro");
   a1.setKman(10000);
        System.out.println(a1.detalheAvião());
}
}