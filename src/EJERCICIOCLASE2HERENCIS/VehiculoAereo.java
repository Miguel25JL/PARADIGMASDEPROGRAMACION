package EJERCICIOCLASE2HERENCIS;

public class VehiculoAereo extends Vehiculo{
    String nombreConductor;
    int numPasajeros;
    String alturaMaxima;

    public VehiculoAereo(String marca, String modelo, int año, String nombreConductor, int numPasajeros, String alturaMaxima) {
        super(marca, modelo, año);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.alturaMaxima=alturaMaxima;
    }

    public String getNombreConductor(){
        return nombreConductor;
    }
    public int getNumPasajeros(){
        return numPasajeros;
    }
    public String getAlturaMaxima(){
        return alturaMaxima;
    }

    public void mostrarInfoVehiculoAerero(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Nombre del Conductor: " + nombreConductor);
        System.out.println("Número de pasajeros: " + numPasajeros);
        System.out.println("Alcanza una altura máxima de: " + alturaMaxima);
    }
}