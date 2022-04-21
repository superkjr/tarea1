package Ejercicios.ejercicio1;


public class Casa {
    private int noCasa;
    private int noPasaje;
    private String nomCalle;

    public Casa() {
    }

    public Casa(int noCasa, int noPasaje, String nomCalle) {
        this.noCasa = noCasa;
        this.noPasaje = noPasaje;
        this.nomCalle = nomCalle;
    }

    public int getNoCasa() {
        return noCasa;
    }

    public void setNoCasa(int noCasa) {
        this.noCasa = noCasa;
    }

    public int getNoPasaje() {
        return noPasaje;
    }

    public void setNoPasaje(int noPasaje) {
        this.noPasaje = noPasaje;
    }

    public String getNomCalle() {
        return nomCalle;
    }

    public void setNomCalle(String nomCalle) {
        this.nomCalle = nomCalle;
    }
    
    String infoCasa(){
        String datos = "";
        datos +="Numero de casa :"+this.getNoCasa()+"\n";
        datos +="Numero de pasaje :"+this.getNoPasaje()+"\n";
        datos +="Nombre de la calle :"+this.getNomCalle()+"\n";
        return datos;
    }
}
