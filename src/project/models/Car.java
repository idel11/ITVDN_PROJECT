package project.models;

import java.util.Date;

public class Car {

    private String color;
    private int id;
    private String name;
    private float engineVolume;
    private int yearOfProduction;

    public Car(String color, int id, String name, float engineVolume, int yearOfProduction) {
        this.color = color;
        this.id = id;
        this.name = name;
        this.engineVolume = engineVolume;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

}
