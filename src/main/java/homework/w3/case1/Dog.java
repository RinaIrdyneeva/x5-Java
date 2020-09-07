package homework.w3.case1;

public class Dog extends Animal {

    private int countCaughtCats = 0;

    public Dog() {
        food = "косточки";
        location = "Двор";
    }

    @Override
    protected void makeNoise() {
        System.out.println("РР ГАВ ГАВ");
    }

    @Override
    protected void eat() {
        System.out.println("ем: " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("собака спит");
    }

    public int getCountCaughtCats() {
        return countCaughtCats;
    }

    public void setCountCaughtCats(int countCaughtCats) {
        this.countCaughtCats = countCaughtCats;
    }
}
