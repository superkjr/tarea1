package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejercicio5 {
    public static void main(String [] args) {
        Ejercicio5();
     }
    public static void Ejercicio5 (){
     Scanner leer = new Scanner (System.in);   
     NumberFormat formato = new DecimalFormat("#0.00");
     
     String nombre;
     double salarioB, llegadaTH,llegadaTM, renta = 0.1, salario, minutos, horas, minutoMH = 0;
     
     
        System.out.println("Escriba el nombre del empleado: ");
        nombre = leer.next();
        
        System.out.println("Escriba las horas de llegadas tardias: ");
        llegadaTH = leer.nextDouble();
        
        System.out.println("Escriba los minutos de llegadas tardias: ");
        llegadaTM = leer.nextDouble();
        
        System.out.println("Digite las horas trabajados");
        horas = leer.nextDouble();
        
        System.out.println("Digite los minutos trabajados");
        minutos = leer.nextDouble();
        
       
        double llegadatr = ejercicio5.llegadaTardia(llegadaTH, llegadaTM);
        double sal = ejercicio5.salarioS (horas, minutos, minutoMH, llegadatr);
        double Rrenta = ejercicio5.RentencioR (sal,renta);
        double salarioBru = ejercicio5.SalarioBruto(sal, Rrenta);
        
        
        
        System.out.println("El nomobre del empleado es: " + nombre);
        
        System.out.println("El descuento por llegada tardia es:$ " + formato.format (llegadatr));
        
        System.out.println("La retencion de la renta es: " + Rrenta);
                
        System.out.println("El salario bruto es: " + formato.format(salarioBru));
    }
    
    public static double salarioS (double horas, double minutos, double minutoMH, double llegadatr){
        double salarioSR = 0;
        
        minutoMH = horas + minutos / 60;
        salarioSR = 15 * minutoMH - llegadatr;
        
        return salarioSR;
    }
    
    public static double llegadaTardia (double llegadaTH, double llegadaTM){
       double TiempoT = 0;
       double TiempoTT = 0;
       
       TiempoT = llegadaTH + llegadaTM / 60;
       TiempoTT = 2 * TiempoT;
       
       return TiempoTT;
    }
    public static double RentencioR (double sal, double renta){
    double RentencionR = 0;
    
    RentencionR = sal * renta;
    
        return RentencionR;
    }
    
    public static double SalarioBruto (double sal, double Rrenta){
        
       double salarioBr = 0;
       salarioBr = sal - Rrenta;
       
       return salarioBr;
    }
    
}
