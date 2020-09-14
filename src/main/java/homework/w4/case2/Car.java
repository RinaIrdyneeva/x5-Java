package homework.w4.case2;

public abstract class Car {

    protected String brand;

    protected String classAuto;

    protected Integer weight;

    protected Engine engine;

    public Car(String brand, String classAuto, Integer weight, Engine engine) {
        this.brand = brand;
        this.classAuto = classAuto;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                '}';
    }
}
