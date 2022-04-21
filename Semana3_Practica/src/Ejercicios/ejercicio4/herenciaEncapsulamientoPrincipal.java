
package Ejercicios.ejercicio4;

import java.util.Scanner;

public class herenciaEncapsulamientoPrincipal {
    public static void main(String[] args) {
        herenciaEncapsulamientoEmpleado emp = new herenciaEncapsulamientoEmpleado();
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Escriba los nombres del contribuyente:");
        emp.setNombres(leer.nextLine());
        System.out.println("Escriba los apellidos del contribuyente:");
        emp.setApellidos(leer.nextLine());
        System.out.println("Escriba el número de NIT del contribuyente:");
        emp.setNit(Long.parseLong(leer.nextLine()));
        System.out.println("Escriba la dirección:");
        emp.setDireccion(leer.nextLine());
        System.out.println("Escriba el salario devengado:");
        System.out.print("$");
        emp.setSalario_devengado(Double.parseDouble(leer.nextLine()));
        System.out.println("Bandera de Empleado:");
        System.out.println("1. Activo \t2.Inactivo");
        System.out.print("Su opción: ");
        opcion = Integer.parseInt(leer.nextLine());
        while((opcion != 1) && (opcion != 2)){
            System.out.println("\nOpción inválida\n");
            System.out.println("Bandera de Empleado:");
            System.out.println("1. Activo \t2.Inactivo");
            System.out.print("Su opción: ");
            opcion = Integer.parseInt(leer.nextLine());
        }
        if(opcion == 1){
            emp.setEstado("Activo");
        }else if(opcion == 2){
            emp.setEstado("Inactivo");
        }
        
        System.out.println(emp.informacionContribuyente());
        
        
    }
}
