package homework.w4.case1;

public class Triangle implements Shape {

    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
        this(2.0, 2.0, 2.0);
    }

    /**
     * Формула Герона для вычисления площади треугольника S по длинам его сторон A, B, C
     *
     * @see <a href="https://ru.wikipedia.org/wiki/%D0%A4%D0%BE%D1%80%D0%BC%D1%83%D0%BB%D0%B0_%D0%93%D0%B5%D1%80%D0%BE%D0%BD%D0%B0">Формула_Герона</a>
     */
    @Override
    public Double square() {
        Double halfPerimetre = (sideA + sideB + sideC) / 2;
        Double square = halfPerimetre * (halfPerimetre - sideA) * (halfPerimetre - sideB) * (halfPerimetre - sideC);
        return square;
    }
}
