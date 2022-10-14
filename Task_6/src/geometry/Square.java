package geometry;

public class Square implements Shape {
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
    public Square(Double side) {
        this.side = side;
    }
    //endregion
    @Override
    public Double area() {
        return side * side;
    }
}
