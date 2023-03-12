package Figure;

public class Circle extends Figures implements Figure {
    private static double radius;
    public static double getRadius(){
        System.out.println("Podaj promien kola: ");
        radius = in.nextDouble();

        return radius;
    }
    public Circle() {
        getRadius();
    }
    @Override
    public double getPerimeter(){
        double perimeter;

        perimeter=radius*2*Math.PI;

        return perimeter;
    }
    @Override
    public double getArea(){
        double area;

        area=Math.pow(radius,2)*Math.PI;

        return area;
    }
}
