package hw3.phone;

public class Main {

    public static void main(String[] args) {

        Phone samsung = new Phone("+79263332211", "GalaxyS10", 175);
        Phone apple = new Phone("+79264445566", "Iphone11", 194);
        Phone xiaomi = new Phone("+79267778899", "Mi10", 208);

        Phone[] phones = new Phone[]{samsung, apple, xiaomi};

        for (Phone el : phones) {
            System.out.println(el.getNumber());
            System.out.println(el.getModel());
            System.out.println(el.getWeight());
            el.receiveCall("Elias");
            el.receiveCall("Elias", "+79031112233");
            el.sendMessage("+79251110022");
            el.sendMessage("+79251110022", "+79267778899", "+79268973323");
            System.out.println("------------");
        }
    }
}
