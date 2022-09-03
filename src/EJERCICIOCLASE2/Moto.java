package EJERCICIOCLASE2;

public class Moto extends VehiculoTerrestre{
    int cilidrada;
    String tipoMoto;
    String color;

    public Moto(String marca, String modelo, int año, String matricula, int numRuedas, int potencia, int cilidrada, String tipoMoto, String color){
        super(marca, modelo, año, matricula, numRuedas, potencia);
        this.matricula=matricula;
        this.numRuedas=numRuedas;
        this.potencia=potencia;
        this.cilidrada=cilidrada;
        this.tipoMoto=tipoMoto;
        this.color=color;
    }
}
