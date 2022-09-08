package MANEJOERRORES;

public class Principal {
    public static void main(String[] args) {
        int[] numeros={1, 2, 3};

        System.out.println("valor: ");
        try{
            System.out.println(numeros[3]);
        } catch (Exception e){
            System.out.println("Error "+ e.getMessage());//throw new RuntimeException(e);
        }
        System.out.println("Final");

        try {
            System.out.println(numeros[5]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
