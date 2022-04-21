package Demostracion;

public class Estudiante extends Notas {
    int carnet ;
    String nombre ;
    String apellido;
    int edad ;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(int carnet, String nombre, String apellido, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    String informacion() {
        String datos = "";
        datos += "El nombre del estudiante es:" + this.nombre + "\n";
        datos += "Los apellidos del estudiante es:" + this.apellido + "\n";
        datos += "La edad del estudiante es:" + this.edad + "\n";
        return datos;
        
        
    }
    
    String info1(){
        String datos = "********************************";
        
        datos += "El nombre del estdiante es :" + this.getNombre() + "\n";
        datos += "El apellido del estudiante es :" +this.getApellido()+ "\n";
        datos += "El nombre del estdiante es :" + this.getEdad() + "\n";
        datos += "**************************************";
        
        return datos;
    }
    
    
    
    String info(int c, String n, String a, int e){
        String datos = "";
        datos += "El carnet del estudiante es: " + c + "\n";
        datos += "El nombre del estudiante es: " + n + "\n";
        datos += "Los apellidos del estudiante es: " + a + "\n";
        datos += "La edad del estudiante es: " + e + "\n";
        return datos;
        
        
    }
    
    
    
    String info3(Estudiante d){
        String datos ="*********************************";
        datos += "El nombre del estdiante es :" + d.getNombre() + "\n";
        datos += "El apellido del estdiante es :" + d.getApellido()+ "\n";
        datos += "El nombre del estdiante es :" + d.getEdad() + "\n";
        datos += "***************************************";
        return datos;
    }
    
    
    
    
    
}
