
package Ejercicios.ejercicio6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class polimorfismoFormatoFecha {
    
    public void FormatoFecha(int dia, int mes, int año){
        String resultado = String.valueOf(dia + "/" +mes + "/" + año);
        System.out.println(resultado);
        
    }
    public String FormatoFecha(String dia, String mes, String año){
        
        String resultado = String.valueOf(dia + "-" + mes + "-" + año);
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        polimorfismoFormatoFecha formatoFecha = new polimorfismoFormatoFecha();
        
        System.out.println("Numero -> 10062012");
        formatoFecha.FormatoFecha(10,06,2012);
        System.out.println(formatoFecha.FormatoFecha("10", "06", "2012"));
    }
}
