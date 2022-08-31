package EJERCICIOCLASE2;

public class Camion extends Vehiculo{
    String nombreConductor;
    String numPasajeros;
    String matricula;
    int potencia;


    public Camion(String marca, String modelo, int año, String nombreConductor, String numPasajeros, String matricula, int potencia) {
        super(marca, modelo, año);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.matricula=matricula;
        this.potencia=potencia;
    }

    public void verDatos(){
        System.out.println("El modelo del camion es: " + getModelo());
    }
    public void verINFO(){
        System.out.println("El camion marca: "+ getMarca() + ", tiene una potencia de: "+ potencia + " hp");
    }
}
