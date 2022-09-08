package EJERCICIOCLASE2HERENCIS;

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

    public int getCilidrada(){
        return cilidrada;
    }
    public String getTipoMoto(){
        return tipoMoto;
    }
    public String getColor(){
        return color;
    }

    public void mostrarInfoMoto(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Número de ruedas: " + getNumRuedas());
        System.out.println("Potencia: " + getPotencia() + " hp");
        System.out.println("Cilindrada: "+ cilidrada + " cc");
        System.out.println("Tipo de moto: "+ tipoMoto);
        System.out.println("Color de la moto: "+ color);
    }
}
