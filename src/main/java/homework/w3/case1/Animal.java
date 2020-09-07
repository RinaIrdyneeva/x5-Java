package homework.w3.case1;

public abstract class Animal {
    protected String food;
    protected String location;

    protected abstract void makeNoise();
    protected abstract void eat();
    protected abstract void sleep();

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
