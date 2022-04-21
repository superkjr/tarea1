package Ejercicios.ejercicio1;

import java.util.Scanner;

public class CasaPrincipal {
    public static void main(String[] args) {
        String casa1 = "";
        Casa casa = new Casa();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca el numero de casa :");
        casa.setNoCasa(Integer.parseInt(leer.nextLine()));
        System.out.println("Introdusca el numero de Pasaje :");
        casa.setNoPasaje(Integer.parseInt(leer.nextLine()));
        System.out.println("Introdusca el nombre de la calle :");
        casa.setNomCalle(leer.nextLine());
        System.out.println("--------------------------------------");
        
        casa1 = casa.infoCasa();
        
        System.out.println(""+casa1);
    }
}
