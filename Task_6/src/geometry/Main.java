package geometry;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10.0));
        shapes.add(new Triangle(10.0,10.0));
        shapes.add(new Square(10.0));

        summaryArea(shapes);
    }

    public static void summaryArea(Collection<Shape> s) {
        Double sum = 0.0;
        for(Shape shape : s){
            Double area = shape.area();
            System.out.println("Area of " + shape.name + " is " + area);
            sum += area;
        }
        System.out.println("Summary area is " + sum);
    }
}

