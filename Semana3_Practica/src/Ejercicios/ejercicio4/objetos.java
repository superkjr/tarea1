
package Ejercicios.ejercicio4;

import java.util.Scanner;

public class objetos {
    String numeroCasa;
    int numeroPasaje;
    String nombreCalle;

    public objetos() {
        
    }
    
    public String info(){
        String resultado = "";
        resultado  = "--Nueva Casa creada--\n";
        resultado += "--Los datos de la nueva casa son:\n";
        resultado += "Número de casa: " + this.getNumeroCasa() + "\n";
        resultado += "Número del pasaje: " + this.getNumeroPasaje() + "\n";
        resultado += "Nombre de la calle: " + this.getNombreCalle() + "\n";
        
        return resultado;
    }

    public objetos(String numeroCasa, int numeroPasaje, String nombreCalle) {
        this.numeroCasa = numeroCasa;
        this.numeroPasaje = numeroPasaje;
        this.nombreCalle = nombreCalle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroPasaje() {
        return numeroPasaje;
    }

    public void setNumeroPasaje(int numeroPasaje) {
        this.numeroPasaje = numeroPasaje;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
    
    
    
    public static void main(String[] args) {
        objetos casa = new objetos();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de casa:");
        casa.setNumeroCasa(leer.nextLine().toUpperCase());
        System.out.println("Ingree el número de pasaje:");
        casa.setNumeroPasaje(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el nombre de la calle:");
        casa.setNombreCalle(leer.nextLine());
        
        String datos = casa.info();
        
        System.out.println(datos);
    }
}
