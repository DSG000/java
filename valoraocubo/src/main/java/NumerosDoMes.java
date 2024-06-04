
import java.util.Scanner;


public class NumerosDoMes {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          System.out.println("digite um numero do mês (1 a 12) :");
                  int mes = sc.nextInt();
                  int dias = CalcDias(mes);
                  System.out.println(dias);
    }
    
    public static int CalcDias (int mes){
        if (mes < 1 || mes >12 ){
            return -1;
        }
                  
        switch (mes){
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
       return 0;
        
        
        
        
    }
}
