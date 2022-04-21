package Ejercicios;


public class Ejercicio4 {
    public static void main (String[] args){
        double AFP = 0.06;
        double emp = 0.065;
        double empleadoP, empleadorP, pagoTotal;
        
        empleadoP = 500 * AFP;
        empleadorP = 500 * emp;
        pagoTotal = empleadoP + empleadorP;
        
        
        System.out.println("El trabajador en concepto de empleado y empleador paga: $" + pagoTotal);
        
    }
}
