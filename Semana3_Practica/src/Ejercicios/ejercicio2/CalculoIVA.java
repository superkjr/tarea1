package Ejercicios.ejercicio2;


public class CalculoIVA {
    private double precArtIva;
    private double precioArticulo;
    private double iva;

    public CalculoIVA() {
    }

    public CalculoIVA(double precArtIva, double precioArticulo, double iva) {
        this.precArtIva = precArtIva;
        this.precioArticulo = precioArticulo;
        this.iva = iva;
    }

    public double getPrecArtIva() {
        return precArtIva;
    }

    public void setPrecArtIva(double precArtIva) {
        this.precArtIva = precArtIva;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
     
    double calculoIva(double precArticulo, double iva1){
        double precio = precArticulo+(precArticulo * iva1);
        return precio;
    }
    
    double calculoIva2(CalculoIVA preiva, double iva){
        double precio1 = preiva.getPrecioArticulo();
        iva = this.precioArticulo * this.iva;
      double precio =  preiva.calculoIva(precio1, preiva.getIva()) - iva;
        return precio;
    }
}
