package EJERCICIOCLASE2HERENCIS;

public class Avion extends VehiculoAereo{
    String numAlerones;
    int numTurbinas;
    String tipoAvion;


    public Avion(String marca, String modelo, int año, String nombreConductor, int numPasajeros, String alturaMaxima, String numAlerones, int numTurbinas, String tipoAvion) {
        super(marca, modelo, año, nombreConductor, numPasajeros, alturaMaxima);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.alturaMaxima=alturaMaxima;
        this.numAlerones=numAlerones;
        this.numTurbinas=numTurbinas;
        this.tipoAvion=tipoAvion;
    }

    public String getNumAlerones(){
        return numAlerones;
    }
    public int getNumTurbinas(){
        return numTurbinas;
    }
    public String getTipoAvion(){
        return tipoAvion;
    }

    public void mostrarInfoAvion(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Nombre del Conductor: " + getNombreConductor());
        System.out.println("Número de pasajeros: " + getNumPasajeros());
        System.out.println("Alcanza una altura máxima de: " + getAlturaMaxima());
        System.out.println("Número de Alerones: " + numAlerones);
        System.out.println("Número de turbinas: " + numTurbinas);
        System.out.println("Tipo de avión: " + tipoAvion);
    }
}
