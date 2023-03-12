package Figure;

public class Triangle extends Figures implements Figure {
    static double side1;
    static double side2;
    public static double getTriangleSideLength(){
        
        System.out.println("Podaj dlugosc pierwszej przyprostokatnej: ");
        side1 = in.nextDouble();
        System.out.println("Podaj dlugosc drugiej przyprostokatnej: ");
        side2 = in.nextDouble();

        
        return 0;
    }
    public Triangle() {
        getTriangleSideLength();
    }
    @Override
    public double getPerimeter(){
        double perimeter = 0;
        double przekatna = 0;

        przekatna=Math.pow(side1,2)+Math.pow(side2,2);
        przekatna=Math.sqrt(przekatna);
        perimeter=side1+side2+przekatna;

        return perimeter;
    }
    @Override
    public double getArea(){
        double area;

        area=side1*side2;

        return area/2;
    }
}
