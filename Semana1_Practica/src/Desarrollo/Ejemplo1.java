package Desarrollo;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Ejemplo1 {
    public static void main(String[] args){
        
        
        double area, radio;
        final double pi = 3.1416;
        
        NumberFormat formato = new DecimalFormat("#0.00");
        
        area = 145;
        radio = Math.sqrt(area / pi );
        System.out.println("radio: " + formato.format(radio)+ " cm");
        
        
        
    }
    
}
