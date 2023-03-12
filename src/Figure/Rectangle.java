package Figure;

public class Rectangle extends Figures implements Figure {
    private static double side1, side2;
    public static double getRectangleSideLength(){
        System.out.println("Podaj dlugosc pierwszego boku prostokatu: ");
        side1 = in.nextDouble();
        System.out.println("Podaj dlugosc drugiego boku prostokatu: ");
        side2 = in.nextDouble();

        return 0;
    }
    public Rectangle() {
        getRectangleSideLength();
    }
    @Override
    public double getPerimeter(){
        double perimeter;

        perimeter=side1+side2;

        return perimeter*2;
    }
    @Override
    public double getArea(){
        double area;

        area=side1*side2;

        return area;
    }
}
