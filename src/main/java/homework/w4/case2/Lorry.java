package homework.w4.case2;

public class Lorry extends Car {

    private Integer liftingСapacity;

    public Lorry(Integer liftingСapacity, Engine engine, String brand, String classAuto, Integer weight) {
        super(brand, classAuto, weight, engine);
        this.liftingСapacity = liftingСapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "liftingСapacity=" + liftingСapacity +
                super.toString() +
                '}';
    }
}
