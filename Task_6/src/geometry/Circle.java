package geometry;

public class Circle extends Shape implements ShapeFunc {
    private Double radius;

    //region Getters/Setters
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    //endregion

    //region Constructors
    public Circle() {
        name = "Circle";
    }
    public Circle(Double radius) {
        this();
        this.radius = radius;
    }
    //endregion
    @Override
    public Double area() {
        return radius * radius * Math.PI;
    }
}
