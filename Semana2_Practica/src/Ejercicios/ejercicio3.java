package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        double salario_base, salario_devengado, comision,  monto_venta;
        int n_autos_vendidos;
        String nombre_vendedor;
        
        salario_base = 800.00;
        comision = 170.00;
        
        System.out.println("Escriba el nombre del vendedor:");
        nombre_vendedor = leer.nextLine();
        System.out.println("Cantidad de automoviles vendidos:");
        n_autos_vendidos = leer.nextInt();
        System.out.println("Monto total de ventas:");
        monto_venta = leer.nextDouble();
        
        System.out.println("---------------------------------------");
        salario_devengado = ejercicio3.calculoSalarioDevengado(salario_base, comision, n_autos_vendidos, monto_venta);
        System.out.println("Nombre del vendedor: " + nombre_vendedor);
        System.out.println("Salario devengado: $" + formato.format(salario_devengado));
    }
    
    public static double calculoSalarioComision(double comision, int n_autos_vendidos, double monto_venta){
        double resultado;
        resultado = (comision * n_autos_vendidos) + (monto_venta * 0.05);
        return resultado;
    }
    
    public static double calculoSalarioDevengado(double salario_base, double comision, int n_autos_vendidos, double monto_venta){
        double resultado;
        resultado = salario_base + ejercicio3.calculoSalarioComision(comision, n_autos_vendidos, monto_venta);
        return resultado;
    }
}
