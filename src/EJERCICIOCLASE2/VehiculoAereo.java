package EJERCICIOCLASE2;

public class VehiculoAereo extends Vehiculo{
    String nombreConductor;
    String numPasajeros;
    String tipoVehiculo;

    public VehiculoAereo(String marca, String modelo, int año, String nombreConductor, String numPasajeros, String tipoVehiculo) {
        super(marca, modelo, año);
        this.nombreConductor=nombreConductor;
        this.numPasajeros=numPasajeros;
        this.tipoVehiculo=tipoVehiculo;
    }

    //public void verDatos(){
    //    System.out.println("El modelo del camion es: " + getModelo());
    //}
    //public void verINFO(){
    //    System.out.println("El camion marca: "+ getMarca() + ", tiene una potencia de: "+ potencia + " hp");
    // }
}