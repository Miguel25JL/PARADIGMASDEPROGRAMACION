package EJERCICIOCLASE;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String direccion;

    public Persona(String nombre, int edad, String sexu, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexu;
        this.direccion=direccion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre"+ nombre);
        System.out.println("Edad"+ edad);
        System.out.println("Sexo" + sexo);
        System.out.println("Direccion"+ direccion);
    }
}
