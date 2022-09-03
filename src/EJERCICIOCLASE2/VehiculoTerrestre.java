package EJERCICIOCLASE2;

public class VehiculoTerrestre extends Vehiculo{
    String matricula;
    int numRuedas;
    int potencia;

    public VehiculoTerrestre(String marca, String modelo, int año, String matricula, int numRuedas, int potencia) {
        super(marca, modelo, año);
        this.matricula=matricula;
        this.numRuedas=numRuedas;
        this.potencia=potencia;
    }
}
