package org.example.models;

public class DeluxeBurger extends Hamburger {
    private final String cips;
    private final String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.10, "White");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    // Getter methods
    public String getCips() {
        return this.cips;
    }

    public String getDrink() {
        return this.drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
