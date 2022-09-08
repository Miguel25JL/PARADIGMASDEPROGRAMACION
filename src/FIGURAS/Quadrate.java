package FIGURAS;

public class Quadrate extends Figure {
    private double side; //lado

    public Quadrate(double side){
        this.side=side;
    }

    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return side * 4;
    }

    public String toString(){
        return "Quadrate{" +
                "side=" + side +
                ", Area=" + calculateArea() +
                ", Perimeter="+ calculatePerimeter()+
                '}';
    }
}