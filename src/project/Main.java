package project;

import project.dao.BetDao;
import project.dao.CarDao;
import project.dao.impl.BetDaoImpl;
import project.dao.impl.CarDaoImpl;
import project.handler.ConsoleHandler;
import project.models.Car;

import static project.handler.ConsoleHandler.betDao;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler.handler();
        System.out.println(betDao.getAll());

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        System.out.println(betDao.getBet(0));

        CarDao carDao = new CarDaoImpl();

        Car bmw = new Car("carbon", 1, "BMW", 2.0f, 2021);
        Car audi = new Car("white", 2, "AUDI", 2.5f, 2020);
        Car mercedes = new Car("grey", 3, "MERCEDES", 2.0f, 2019);

        carDao.addCar(bmw);
        carDao.addCar(audi);
        carDao.addCar(mercedes);

        System.out.println(carDao.getCar(0));
        System.out.println(carDao.getAllCars());



        /*System.out.println();
        System.out.println("***************************************");
        System.out.println("Testing getters & setters of Car class");
        Car bmw = new Car();
        bmw.setId(1);
        bmw.setName("BMW");
        bmw.setColor("Black");
        bmw.setEngineVolume(2.0f);
        bmw.setYearOfProduction(2021);
        System.out.print(bmw.getId() + " *** ");
        System.out.print(bmw.getName() + " *** ");
        System.out.print(bmw.getColor() + " *** ");
        System.out.print(bmw.getEngineVolume() + " *** ");
        System.out.print(bmw.getYearOfProduction());*/
        
    }
}
