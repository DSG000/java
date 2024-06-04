
package com.mycompany.loja;

import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class Loja {

    public static void main(String[] args) {
 String produto1 = "Computador";
String produto2 = "Mesa de Escritório";

String nomePessoa = "Maria";
int idade = 30;
int código = 5290;
char genero = 'F';

double preco1 = 2.100;
double preco2 = 650.50;
double medidaDaMesa = 53.234567;
    
System.out.printf("%s está custando %.3f R$",produto1,preco1);
        System.out.printf("\n%s está custando %.2f R$", produto2,preco2);
        System.out.printf("\nregistro de pessoa: %s, %d anos, codigo %d e sexo %c",nomePessoa,idade,código,genero);
        System.out.printf("\nmedida da mesa com oito casas decimais: %.8f",medidaDaMesa);
        System.out.printf("\nmedida da mesa com três casas decimais: %.3f",medidaDaMesa);
        Locale.setDefault(Locale.US);
        System.out.printf("\nmedida da mesa com ponto decimal dos EUA: %.3f",medidaDaMesa);
    }


}

