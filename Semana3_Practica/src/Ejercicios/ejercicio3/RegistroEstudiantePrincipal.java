package Ejercicios.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistroEstudiantePrincipal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Canet del estudiante:");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del estudiante:");
            System.out.println("Apellidos del estudiante:");
            String apellidos = leer.readLine();
            
            estudiante.setCarnetEstudiante(carnet);
            estudiante.setNombresEstudiante(nombres);
            estudiante.setApellidosEstudiante(apellidos);
                      
            System.out.println("-----------DATOS------------");
            System.out.println("Carnet: " + estudiante.getCarnetEstudiante());
            System.out.println("Nombres: " + estudiante.getNombresEstudiante());
            System.out.println("Apellidos: " + estudiante.getApellidosEstudiante());
        }catch(IOException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
