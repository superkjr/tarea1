package Ejercicios;


public class Ejercicio5 {
    public static void main (String[] args){
        
        double salario, horasExtra, renta , ExtraAc, salarioMensual, SalarioTotal;
        
        salario = 10;
        horasExtra = 50;
        renta = 0.1;
        salarioMensual = salario * 30;
        ExtraAc = horasExtra * salario * (renta);
        SalarioTotal = salarioMensual + ExtraAc;
        System.out.println("Salario mensual sin Horas Extra: $" + salarioMensual);
        System.out.println("Total de Horas Extra: $" + ExtraAc);
        System.out.println("Salario mensual con Horas Extra: $" + SalarioTotal);
        
}
    
}
