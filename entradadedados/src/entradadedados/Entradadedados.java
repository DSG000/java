

package entradadedados;

import java.util.Locale;
import java.util.Scanner;
public class Entradadedados {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
     String x, y, z;
     int w;
       
        System.out.println("pode digitar: ");
      
      //stem.out.println("digite uma string, um int e um double");
     /*
        String x = sc.nextLine();
       int y = sc.nextInt();
      double z = sc.nextDouble();
      char w = sc.next().charAt(3);
      */
     
      w = sc.nextInt();
      sc.nextLine();
      x = sc.nextLine();
      y = sc.nextLine();
      z = sc.nextLine();
      
        System.out.println("dados digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);  
        System.out.println(w);
        sc.close();
    }
    
}
 