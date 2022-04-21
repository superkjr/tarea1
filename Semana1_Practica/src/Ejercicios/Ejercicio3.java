package Ejercicios;


public class Ejercicio3 {
    public static void main (String[] args){
        
        double salarioHora, tiempo, Salariototal, renta, TotalR, totalF;
        
       salarioHora = 8.00;
       tiempo = 36;
       Salariototal = 8.00 * 36;
       renta = 0.1;
       TotalR = Salariototal * renta;
       totalF = Salariototal - TotalR;
       
       System.out.println("El salario sin descuento es: $" + Salariototal);
       System.out.println("El descuento es: $" + TotalR);  
       System.out.println("El salario con descuento es: $" + totalF);
}
}
