package EJERCICIOCLASE2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
