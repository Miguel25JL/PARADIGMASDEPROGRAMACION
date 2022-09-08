package EJERCICIOCLASE2HERENCIS;

public class Main {
    public static void main(String[] args) {
        Vehiculo V1 = new Vehiculo("Chevrolet", "Onix", 2021);

        VehiculoAereo VA1 = new VehiculoAereo("Airbus","A340",2011,"Guillermo",359,"11500");
        Avion A1 = new Avion("Boeing","737MAX",2016,"Julian",250,"10200","2",2,"Comercial");
        Helicoptero H1 = new Helicoptero("Bell Helicopter","Bell412",1990,"Manuel",4,"3000","Vertical",2,15000);

        VehiculoTerrestre VT1 = new VehiculoTerrestre("Nissan","Sentra",2018,"NVL3718",4,210);
        Coche C1 = new Coche("Ford","Fiesta",2015,"NVP9172",4,215,"Manual",1.8,"Sedán");
        Moto M1 = new Moto("Yamaha","YZFR15",2022,"NMQ0137",2,155,155,"Deportiva","Azul");

        System.out.println("CLASE PRINCIPAL: VEHICULO");
        V1.mostrarInfoVehiculo();
        System.out.println("====================================");
        System.out.println("VEHICULO AEREO");
        VA1.mostrarInfoVehiculoAerero();
        System.out.println("===================================");
        System.out.println("VEHICULO TERRESTRE");
        VT1.mostrarInfoVehiculoTerrestre();
        System.out.println("===================================");
        System.out.println("VEHICULO AEREO: AVION");
        A1.mostrarInfoAvion();
        System.out.println("===================================");
        System.out.println("VEHICULO AEREO: HELICOPTERO");
        H1.mostrarInfoHelicoptero();
        System.out.println("===================================");
        System.out.println("VEHICULO TERRESTRE: COCHE");
        C1.mostrarInfoCoche();
        System.out.println("===================================");
        System.out.println("VEHICULO TERRESTRE: MOTO");
        M1.mostrarInfoMoto();
    }
}