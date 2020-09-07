package homework.w3.case3;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1 = new Phone();
        phone2 = new Phone(777888, "nokia");
        phone3 = new Phone(222333, "iphone", 220);

        phone1.receiveCall("Rob");
        phone2.receiveCall("Den", 978555);

        phone3.sendMessage("My vacation!", 777888, 222333, 978555, 655412, 548763);
    }
}
