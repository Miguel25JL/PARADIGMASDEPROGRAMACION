package EJERCICIOCLASE2;

public class Avion extends VehiculoAereo{
    String numAlerones;
    int numTurbinas;
    String tipoAvion;

    public Avion(String marca, String modelo, int año, String nombreConductor, String numPasajeros, String alturaMaxima, String numAlerones, int numTurbinas, String tipoAvion) {
        super(marca, modelo, año, nombreConductor, numPasajeros, alturaMaxima);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.alturaMaxima=alturaMaxima;
        this.numAlerones=numAlerones;
        this.numTurbinas=numTurbinas;
        this.tipoAvion=tipoAvion;
    }
}
