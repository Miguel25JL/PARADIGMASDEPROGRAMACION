package EJERCICIOCLASE2HERENCIS;

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

    public String getMatricula(){
        return matricula;
    }
    public int getNumRuedas(){
        return numRuedas;
    }
    public int getPotencia(){
        return potencia;
    }

    public void mostrarInfoVehiculoTerrestre(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Matricula: " + matricula);
        System.out.println("Número de ruedas: " + numRuedas);
        System.out.println("Potencia: " + potencia + " hp");
    }
}
