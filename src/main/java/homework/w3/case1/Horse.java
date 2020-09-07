package homework.w3.case1;

public class Horse extends Animal {

    private int maxSpeedInKm = 0;

    public Horse() {
        food = "Сено";
        location = "Конюшня";
    }

    @Override
    protected void makeNoise() {
        System.out.println("ИА ИА ИА");
    }

    @Override
    protected void eat() {
        System.out.println("ем: " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("лощадь спит");
    }

    public int getMaxSpeedInKm() {
        return maxSpeedInKm;
    }

    public void setMaxSpeedInKm(int maxSpeedInKm) {
        this.maxSpeedInKm = maxSpeedInKm;
    }
}
