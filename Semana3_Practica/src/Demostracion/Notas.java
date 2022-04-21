package Demostracion;



public class Notas {
    double n1;
    double n2;
    double n3;

    public Notas() {
    }

    public Notas(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    public double promedio (Notas x){
        
        double pm = 0;
        pm = (x.n1 + x.n2 + x.n3) / 3;
        return pm;
    }
    
    public String cualidad(Notas pm){
        double prom = 0.0;
        String cual;
        //rom = pm.promedio(pm);
        prom = this.promedio(pm);
        
        if(prom > 0 && prom <= 3){
            cual = "Necesita mejorar";
        }else if (prom > 3 && prom <=9){
            cual = "Bueno";
        }else if (prom > 6 && prom <=9){
                    cual ="Muy bueno";
         }else if (prom == 10){
                    cual = "Exelente";
                    
    
        }
        return "";
    }
    
}
