package EJERCICIOCLASE2HERENCIS;

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

    public String getTransmision(){
        return transmision;
    }
    public double getMotor(){
        return motor;
    }
    public String getTipoCoche(){
        return tipoCoche;
    }

    public void mostrarInfoCoche(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Número de ruedas: " + getNumRuedas());
        System.out.println("Potencia: " + getPotencia() + " hp");
        System.out.println("Transmision: "+ transmision);
        System.out.println("Motor: "+ motor + " L");
        System.out.println("Tipo de Coche: "+ tipoCoche);
    }
}
