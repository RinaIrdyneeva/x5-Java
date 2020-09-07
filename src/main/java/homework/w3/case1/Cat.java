package homework.w3.case1;

public class Cat extends Animal {

    private int countCaughtMouses = 0;

    public Cat() {
        food = "вискас";
        location = "спальня";
    }

    @Override
    protected void makeNoise() {
        System.out.println("МЯУ МУР МУР");
    }

    @Override
    protected void eat() {
        System.out.println("ем: " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("кошка спит");
    }

    public int getCountCaughtMouses() {
        return countCaughtMouses;
    }

    public void setCountCaughtMouses(int countCaughtMouses) {
        this.countCaughtMouses = countCaughtMouses;
    }
}
