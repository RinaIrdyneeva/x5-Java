package homework.w4.case1;

public class Circle implements Shape {

    private Double radius;

    public Circle() {
        this(74.2);
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    /**
     * S = PI * R^2
     */
    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
