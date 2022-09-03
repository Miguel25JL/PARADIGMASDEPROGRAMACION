package EJERCICIOCLASE2;

public class Helicoptero extends VehiculoAereo{
    String tipoAterrizaje;
    int numRotores;
    int pesoMax;

    public Helicoptero(String marca, String modelo, int año, String nombreConductor, String numPasajeros, String alturaMaxima, String tipoAterrizaje, int numRotores, int pesoMax) {
        super(marca, modelo, año, nombreConductor, numPasajeros, alturaMaxima);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.alturaMaxima=alturaMaxima;
        this.tipoAterrizaje=tipoAterrizaje;
        this.numRotores=numRotores;
        this.pesoMax=pesoMax;
    }
}
