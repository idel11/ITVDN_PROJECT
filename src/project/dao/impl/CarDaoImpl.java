package project.dao.impl;

import project.dao.CarDao;
import project.db.Storage;
import project.models.Car;

import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public void addCar(Car car) {
        Storage.cars.add(car);
    }

    @Override
    public List<Car> getAllCars() {
        return Storage.cars;
    }

    @Override
    public Car getCar(int index) { return Storage.cars.get(index); }

}
