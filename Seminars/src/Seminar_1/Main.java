package Seminar_1;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 180));
        machine.addProduct(new Product("Mars", 75));
        machine.addProduct(new Product("Twix", 78.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко \"Бурёнка\"", 72, new Date(123,1,25)));
        machine.addProduct(new Perishable("Молоко \"Коровка\"", 72, new Date(123,1,25)));
        machine.addProduct(new Perishable("Молоко \"Топлёное\"", 72, new Date(123,1,25)));
        machine.addProduct(new HotDrinks("Чай \"Липтон\"", 62, "0.3"));
        machine.addProduct(new HotDrinks("Кофе \"Капучино\"", 120, "0.3"));
        machine.addProduct(new HotDrinks("Горячий шоколад", 91.20, "0.3"));

        System.out.println(machine);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Mars"));
        System.out.println(machine.findProduct("Beer"));
        System.out.println(machine.findProduct("Чай"));
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("куплен:" + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("куплен:" + machine.sellProduct(machine.findProduct("Горячий шоколад").get(0)));
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(machine);
    }
}
