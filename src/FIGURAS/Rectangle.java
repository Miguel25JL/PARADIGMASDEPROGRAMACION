package FIGURAS;

public class Rectangle extends Figure{
    private double base;
    private double height;
    private double perimeter;

    public Rectangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    public double calculateArea(){
        return base * height;
    }
    public double calculatePerimeter(){
        perimeter = (base * 2) + (height * 2);
        return perimeter;
    }

    public String toString(){
        return "Rectangle{" +
                "base=" + base +
                "height=" + height +
                ", Area=" + calculateArea() +
                ", Perimeter="+ calculatePerimeter()+
                '}';
    }
}
