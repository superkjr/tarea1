package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Ejercicio1 {
    public static void main (String[] args){
        double R1, R2 , R3 , R4, sudeno,Req;
        
        NumberFormat formato =  new DecimalFormat("#0.00");
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        sudeno = ((1/R1) + (1/R2) + (1/R3) + (1/R4));
        Req = 1/sudeno;
         System.out.println("La resistencia equivalente es: " + formato.format(Req));
    }
}
