package ru.netology.javaqa_homework_13.AllAboutProducts;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int price, String title, String manufacturer) {
        super(id, name, price, title);
        this.manufacturer = manufacturer;
    }
}
