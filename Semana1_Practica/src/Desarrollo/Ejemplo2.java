package Desarrollo;


public class Ejemplo2 {
    public static void main (String[] args){
        double interes, capitalPrestado, tiempo, tasadeinteres, tiempoenmeses;
    
    interes = 144;
    capitalPrestado =  1200.00;
    tasadeinteres = 0.08;
    tiempo = interes / (capitalPrestado * tasadeinteres);
    tiempoenmeses = tiempo * 12;
    System.out.println("Tiempo: " + tiempo + "años");
    System.out.println("Tiempo: " + tiempoenmeses + "meses");
}
    
}
