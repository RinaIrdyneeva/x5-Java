package homework.w4.case1;

public class Rectangle implements Shape {

    private Double rectangleHeight;
    private Double rectangleWidth;

    public Rectangle(Double rectangleHeight, Double rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }

    public Rectangle() {
        this(7.0, 21.0);
    }

    /**
     * S = width * height;
     */
    @Override
    public Double square() {
        return rectangleHeight * rectangleWidth;
    }
}
