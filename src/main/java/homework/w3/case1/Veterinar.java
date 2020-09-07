package homework.w3.case1;

public class Veterinar {

    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Dog(), new Horse() };
        Veterinar veterinar = new Veterinar();

        for(Animal animal: animals) {
            veterinar.treatAnimal(animal);
        }

    }

    public void treatAnimal(Animal animal) {
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        System.out.println(animal.toString());
    }

}
