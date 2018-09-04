package com.example.cars;

public class Car {
    private int id;
    private String model;
    private int yearOfManufacture;
    private String color;

    public Car(int id, String model, int yearOfManufacture, String color) {
        this.id = id;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
