
package Ejercicios.ejercicio5;

import Ejercicios.ejercicio5.CalculoIVA;
import java.util.Scanner;

public class objetosProductosPrincipal {
    public static void main(String[] args) {
        CalculoIVA IVA = new CalculoIVA();
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese el valor del producto: $");
        double precio = Double.parseDouble(leer.nextLine());
        
        System.out.println("\n\nEl porcentaje del IVA es del 13%");
        System.out.println("\nEl precio final del producto con IVA es de: $" + IVA.precioConIVA(precio));
        System.out.println("El precio final del producto sin IVA es de: $ " + IVA.precioSinIVA(precio));
    }
}
