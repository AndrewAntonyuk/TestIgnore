package geometry;

public class Square extends Shape implements ShapeFunc{
    private Double side;

    //region Getters/Setters
    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
    //endregion

    //region Constructors
    public Square() {
        name = "Square";
    }
    public Square(Double side) {
        this();
        this.side = side;
    }
    //endregion
    @Override
    public Double area() {
        return side * side;
    }
}
