package Demostracion;

import java.util.Scanner;


public class Semana2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de n1");
        int x = leer.nextInt();
        System.out.println("Ingrese el valor de n2");
        int y = leer.nextInt();
        
        Semana2.sumar(x, y);
        
        int resta = restar(x, y);
        System.out.println("La resta es: " + resta);
        Semana2.multiplicar(12, 5, "Mario");
    }
    
    private static int sumar(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    private static int restar(int a, int b){
        int restar = a - b;
        return restar;
    }
    private static void multiplicar(int a, int b, String nombre){
        int mul = a*b;
        System.out.println("La multiplicación es de: " + mul);
        System.out.println("El nombre es: " + nombre);
    }
    
}
