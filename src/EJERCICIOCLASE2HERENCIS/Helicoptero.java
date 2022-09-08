package EJERCICIOCLASE2HERENCIS;

public class Helicoptero extends VehiculoAereo{
    String tipoAterrizaje;
    int numRotores;
    int pesoMax;

    public Helicoptero(String marca, String modelo, int año, String nombreConductor, int numPasajeros, String alturaMaxima, String tipoAterrizaje, int numRotores, int pesoMax) {
        super(marca, modelo, año, nombreConductor, numPasajeros, alturaMaxima);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.alturaMaxima=alturaMaxima;
        this.tipoAterrizaje=tipoAterrizaje;
        this.numRotores=numRotores;
        this.pesoMax=pesoMax;
    }

    public String getTipoAterrizaje(){
        return tipoAterrizaje;
    }
    public int getNumRotores(){
        return numRotores;
    }
    public int getPesoMax(){
        return pesoMax;
    }

    public void mostrarInfoHelicoptero(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Nombre del Conductor: " + getNombreConductor());
        System.out.println("Número de pasajeros: " + getNumPasajeros());
        System.out.println("Alcanza una altura máxima de: " + getAlturaMaxima());
        System.out.println("Tipo de aterrizaje: " + tipoAterrizaje);
        System.out.println("Número de rotores: " + numRotores);
        System.out.println("Peso máximo que soporta: " + pesoMax + " kg");
    }
}
