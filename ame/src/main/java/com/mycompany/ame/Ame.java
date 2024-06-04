

package com.mycompany.ame;

import java.util.Locale;
import java.util.Scanner;


public class Ame {

    public static void main(String[] args) {
     /*clase caneta azul
modelo/marca: caracter - string
cor : caracter - String - azul
ponta: numero real - double 2.0
carga: numero iteiro - int - 50
tampa: atributo logico= boolean(true/false) - false

METODO
escrever
rabisco
pintar 
tampar
destampar

METODO  tampar() = ESTADO - tampada , 50%

objeto - uma caneta
classe - forma/molde

metodo rabiscar();SEMPRE vai ter ()
se (tampada) entao - sout = erro
else - sout rabiscar0
simSe
fimMetodo

metodo tampar();
tampada = verdadeira - true
fim metodo}
fim classe}

objeto - uma caneta
classe - forma/molde

c1 = new caneta; 
*depois do new e a classe que vou utilizar antes do new é o objeto que vai existir

c1.cor =azul
o atributo cor do objeto c1 esta recebendo "azul"

c1.ponta = 0.5;
c1.tampada = false

c1.escrever();

c2. = new caneta;
*/  Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     Scanner sc2 = new Scanner(System.in);
     
 
        System.out.println("Digite a marca da caneta: ");
        String marcac1 = sc.nextLine();
        System.out.println("Digite a cor da caneta: ");
        String corc1 = sc.nextLine();
        System.out.println("Digite a espessura da caneta: ");
        Double pontac1 = sc.nextDouble();
        System.out.println("Digite a carga da caneta: ");
        int cargac1 = sc.nextInt();
        
        
     
        Canetas c1 = new Canetas();
        
        c1.cor = corc1;
        c1.ponta = pontac1;
        c1.marca = marcac1;
        c1.carga = cargac1;
     
        boolean respostaTampada = c1.perguntarTampada();
        c1.tampada = respostaTampada;
        
        c1.estado();
        c1.escrever();
        
        /*Canetas c2 = new Canetas();
        c2.marca = "bic";
        c2.cor = "preta";
        c2.ponta = 0.5;
        c2.carga = 1;
        c2.destampar();
        c2.estado();
        c2.escrever();
        */
        
        
    }
}
