package homework.w4.case2;

public class SportCar extends Car {

    private Double maxSpeed;

    public SportCar(Double maxSpeed, Engine engine, String brand, String classAuto, Integer weight) {
        super(brand, classAuto, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                super.toString() +
                "}";
    }
}
