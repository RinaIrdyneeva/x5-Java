package homework.w4.case1;

/**
 * 1.Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
 * 2.Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
 * 3.Создать метод main по примеру
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh: shape){
            System.out.println("Площадь фигуры: "+sh.square());
        }
    }
}
