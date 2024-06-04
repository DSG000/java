
package com.mycompany.dnaanimal;

public class DNAanimal {

    public static void main(String[] args) {
        
  Mamifero m = new Mamifero();
  Reptil r = new Reptil();
  Peixe p = new Peixe();
  Ave a = new Ave();
  Canguru c = new Canguru();
          
  m.setPeso(85.5);
  m.setIdade(2);
  m.setMembro(4);
  m.alimentar();
  m.locomover();
  m.emitirSom();
  System.out.println(m.dadosAnimal());
  
  r.setPeso(90);
  r.setIdade(3);
  r.setMembro(4);
  r.alimentar();
  r.locomover();
  r.emitirSom();
  System.out.println(r.dadosAnimal());
  
  p.setPeso(200);
  p.setIdade(140);
  p.setMembro(2);
  p.alimentar();
  p.locomover();
  p.emitirSom();
  p.soltarbolha();
  System.out.println(p.dadosAnimal());
  
  a.setPeso(50);
  a.setIdade(17);
  a.setMembro(4);
  a.alimentar();
  a.locomover();
  a.emitirSom();
  a.setCorPena("amarela");
  a.getCorPena();
  a.fazerninho();
  System.out.println(a.dadosAnimal());
  
  c.setPeso(50);
  c.setIdade(17);
  c.setMembro(4);
  c.alimentar();
  c.locomover();
  c.emitirSom();
    }
}
