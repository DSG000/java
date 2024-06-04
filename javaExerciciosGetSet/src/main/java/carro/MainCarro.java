
package carro;


public class MainCarro {
    public static void main(String[] args) {
      carro c = new carro ("Toyota", "corolla", 2024);
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getano());
        
        c.setMarca("honda");
        c.setmodelo("civic");
        c.setano(2024);
        
    }
}
