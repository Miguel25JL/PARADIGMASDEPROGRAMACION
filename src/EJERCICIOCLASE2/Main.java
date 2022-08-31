package EJERCICIOCLASE2;

public class Main {
    public static void main(String[] args) {
        Vehiculo V1 = new Vehiculo("Nissan", "sentra", 2015);
        Camion C1 = new Camion("Mercedez", "MBO", 2019, "Miguel", "50", "ZBN9851", 210);

        V1.mostrarInfo();
        System.out.println();
        C1.mostrarInfo();
        System.out.println();
        C1.verDatos();
        C1.verINFO();
    }
}
