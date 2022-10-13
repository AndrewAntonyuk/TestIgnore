package geometry;

public class Triangle extends Shape implements ShapeFunc {
    private Double base;
    private Double verticalHeight;

    //region Setters/Getters
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getVerticalHeight() {
        return verticalHeight;
    }

    public void setVerticalHeight(Double verticalHeight) {
        this.verticalHeight = verticalHeight;
    }
    //endregion

    //region Constructors
    public Triangle() {
        name = "Triangle";
    }
    public Triangle(Double base, Double verticalHeight) {
        this();
        this.base = base;
        this.verticalHeight = verticalHeight;
    }
    //endregion
    @Override
    public Double area() {
        return base * verticalHeight / 2;
    }
}
