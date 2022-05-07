package project;

import project.handler.ConsoleHandler;
import project.models.Car;

import static project.db.Storage.bets;
import static project.handler.ConsoleHandler.betDao;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler.handler();
        System.out.println(betDao.getAll());
        System.out.println("Testing getters & setters of Car class");
        Car bmw = new Car("BMW");
        bmw.setId(1);
        bmw.setColor("Carbon black");
        bmw.setEngineVolume(2.0f);
        bmw.setYearOfProduction(2021);
        System.out.print(bmw.getId() + " ");
        System.out.print(bmw.getName() + " ");
        System.out.print(bmw.getColor() + " ");
        System.out.print(bmw.getEngineVolume() + " ");
        System.out.print(bmw.getYearOfProduction());
    }
}
