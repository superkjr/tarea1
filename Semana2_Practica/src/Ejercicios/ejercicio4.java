package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double salario_base, comision, renta;
        int cant_comp;
        String nombre_vendedor = "Kevin Ricardo Torres Muñoz";
        
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        
        salario_base = 300;
        comision = 50;
        renta = 0.1;
        
        System.out.println("¿Cuantas computadoras ha vendido el vendedor?");
        cant_comp = leer.nextInt();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nombre del vendedor: " + nombre_vendedor);
        double salarioDevengado = CalculoSalarioDevengado(salario_base, cant_comp, comision);
        System.out.println("Salario devengado: $" + salarioDevengado);
        calculoRenta(renta, salario_base, cant_comp, comision);
        
        
        
    }
    
    public static void calculoRenta( double renta, double salario_base, int cant_comp, double comision){
        double resultado;
        resultado = CalculoSalarioDevengado(salario_base, cant_comp, comision) * renta;
        System.out.println("La retención de la renta es de: $" + resultado);
    }
    
    public static double CalculoSalarioDevengado(double salario_base, int cant_comp, double comision){
        double resultado;
        resultado = salario_base + (comision * cant_comp);
        return resultado;
    }
}
