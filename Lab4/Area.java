abstract class CalculateArea{
    void calculateArea(){

    };
}

class Circle extends CalculateArea{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    void calculateArea(){
        double area = (float) 3.14 * radius * radius;
        System.out.println("The area of the circle is: "+area);
    }
}

class Rectangle extends CalculateArea{
    int l,b;
    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    @Override
    void calculateArea(){
        double area = (float) l * b;
        System.out.println("The area of the rectangle is: "+area);
    }
}

class Triangle extends CalculateArea{
    int b, h;
    public Triangle(int b, int h){
        this.b = b;
        this.h = h;
    }

    @Override
    void calculateArea(){
        double area = (float) 0.5 * b * h;
        System.out.println("The area of the triangle is: "+area);
    }
}

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        circle.calculateArea();
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.calculateArea();
        Triangle triangle = new Triangle(20, 30);
        triangle.calculateArea();
    }
}
