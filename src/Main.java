import Figure.Figure;

import java.util.ArrayList;
import java.util.List;
import Figure.Circle;
import Figure.Triangle;
import Figure.Rectangle;

public class Main {
    public static void main(String[] args) {
        List<Figure> figure = new ArrayList<>();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        figure.add(circle);
        figure.add(triangle);
        figure.add(rectangle);

        for (Figure a:figure) {
            System.out.println(a.getClass().getSimpleName());
            System.out.println(a.getArea());
            System.out.println(a.getPerimeter());
            System.out.println();
        }
    }
}