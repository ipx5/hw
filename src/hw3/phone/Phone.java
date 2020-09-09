package hw3.phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }

    public void sendMessage(String... numbers) {
        StringBuilder stringBuilder = new StringBuilder();

        if (numbers.length == 0) {
            stringBuilder.append("Номера рассылки не указаны.");
        } else if (numbers.length == 1) {
            stringBuilder.append("Сообщение будет отправлено на номер: " + numbers[0]);
        } else {
            stringBuilder.append("Сообщения будут отправленны на номера: ");
            for (String number : numbers) {
                stringBuilder.append(number + " ");
            }
        }

        System.out.println(stringBuilder.toString());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
