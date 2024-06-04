
package monster;

import java.util.Scanner;

public class MainMonster {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
                  System.out.println("Temos Monster dos sabores: \n1=Mango louco\n2=Ultra violet\n3=Absolutely zero\n4=Original");
         
         
         System.out.println("Digite o Sabor que você quer com o numero: ");
         
        // String sabor = sc.nextLine();
         monster m1 = new monster("Mango louco", 9.50);
          
         m1.setmonster(sc.nextLine());
         
         
        
    }
}
