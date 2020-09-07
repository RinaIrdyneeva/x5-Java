package homework.w3.case3;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() { }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("****** Звонит " + callerName);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String callerName, int callerNumber) {
        receiveCall(callerName + " | с номера: " + callerNumber);
    }

    public void sendMessage(String message, int... phoneNumbers) {
        System.out.println(" ==================== ");
        System.out.println("  Сообщение: " + message);
        System.out.println("  отправлено на номера:");
        for (int element: phoneNumbers) {
            System.out.println("      " + element);
        }
        System.out.println(" ==================== ");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
