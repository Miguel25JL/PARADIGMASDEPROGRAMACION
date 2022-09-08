package FIGURAS;

public class Triangle extends Figure {
    private double areaT;
    private double side1, side2, side3;
    private double perimeterT;

    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double calculateArea(){
        // area=base*altura/2
        double s= (side1 + side2 + side3)/2;
        areaT=Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        return areaT;
    }
    public double calculatePerimeter(){
        perimeterT = side1 + side2 + side3;
        return perimeterT;
    }

    public String toString(){
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area=" + calculateArea() +
                ", Perimeter="+ calculatePerimeter()+
                '}';
    }
}