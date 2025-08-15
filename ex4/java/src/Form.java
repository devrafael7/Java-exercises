abstract class Form {
    public abstract double calculateArea();
}

class Square extends Form {
    double side;

    public Square(double side){
        this.side = side;
    }

    public double calculateArea(){
        return side * side;
    }
}

class Circle extends Form{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }


}
