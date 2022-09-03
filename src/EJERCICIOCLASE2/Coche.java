package EJERCICIOCLASE2;

public class Coche extends VehiculoTerrestre{
    String transmision;
    double motor;
    String tipoCoche;

    public Coche(String marca, String modelo, int año, String matricula, int numRuedas, int potencia, String transmision, double motor, String tipoCoche) {
        super(marca, modelo, año, matricula, numRuedas, potencia);
        this.matricula=matricula;
        this.numRuedas=numRuedas;
        this.potencia=potencia;
        this.transmision=transmision;
        this.motor=motor;
        this.tipoCoche=tipoCoche;
    }
}
