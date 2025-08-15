
public class App {
    public static void main(String[] args) throws Exception {
        Form f1 = new Square(3);
        Form f2 = new Circle(4);

        System.out.println(f1.calculateArea());
        System.out.println(f2.calculateArea());
    }
}
