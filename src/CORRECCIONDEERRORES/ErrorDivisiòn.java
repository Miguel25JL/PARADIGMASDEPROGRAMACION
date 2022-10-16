package CORRECCIONDEERRORES;

public class ErrorDivisiòn {
    public static void main(String[] args) {
        int a = 122;
        int b = 0;
        try {
            int division = a / b;
        }
        catch
        (ArithmeticException e){
        }
        System.out.println("Error, la división entre cero no se puede ");
    }
}
