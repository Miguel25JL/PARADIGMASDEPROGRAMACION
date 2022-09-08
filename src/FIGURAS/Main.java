package FIGURAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figure[] figs=new Figure[3];
        int opcion;

        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    int opcionElegida;
                    System.out.println("Ingresa los datos del Triangulo");
                    double side1, side2, side3;
                    System.out.print("La medida del lado 1: ");
                    side1 = entrada.nextDouble();
                    System.out.print("La medida del lado 2: ");
                    side2 = entrada.nextDouble();
                    System.out.print("La medida del lado 3: ");
                    side3 = entrada.nextDouble();
                    figs[0]=new Triangle(side1, side2, side3);
                    System.out.println("¿Qué quieres calcular?");
                    System.out.println("1.-Area");
                    System.out.println("2.-Perimetro:");
                    opcionElegida = entrada.nextInt();
                    if(opcionElegida==1){
                        System.out.println("El area es: " + figs[0].calculateArea());
                    }
                    else {
                        System.out.println("El perimetro es: " + figs[0].calculatePerimeter());
                    }
                    break;
                case 2:
                    double side;
                    System.out.print("Ingresa la medida de un lado del cuadrado: ");
                    side = entrada.nextDouble();
                    figs[1]=new Quadrate(side);
                    System.out.println("¿Qué quieres calcular?");
                    System.out.println("1.-Area");
                    System.out.println("2.-Perimetro:");
                    opcionElegida = entrada.nextInt();
                    if(opcionElegida==1){
                        System.out.println("El area es: " + figs[1].calculateArea());
                    }
                    else {
                        System.out.println("El perimetro es: " + figs[1].calculatePerimeter());
                    }
                    break;
                case 3:
                    double base, height;
                    System.out.print("Ingresa la medida de la base: ");
                    base = entrada.nextDouble();
                    System.out.print("Ingresa la medida de la altura: ");
                    height = entrada.nextDouble();
                    figs[2]=new Rectangle(base, height);
                    System.out.println("¿Qué quieres calcular?");
                    System.out.println("1.-Area");
                    System.out.println("2.-Perimetro:");
                    opcionElegida = entrada.nextInt();
                    if(opcionElegida==1){
                        System.out.println("El area es: " + figs[2].calculateArea());
                    }
                    if (opcionElegida==2){
                        System.out.println("El perimetro es: " + figs[2].calculatePerimeter());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida escoje otra opción");
                    break;
            }
        } while (opcion != 4);
    }
    private static void menu() {
        System.out.println("MENU PARA CALCULAR EL AREA Y PERIMETRO DE UNA FIGURA");
        System.out.println("SLECCIONA UNA FIGURA");
        System.out.println("1.-Triangulo");
        System.out.println("2.-Cuadrado");
        System.out.println("3.-Rectangulo");
        System.out.println("4.-Salir");
        System.out.println("==================================================");

    }
}
