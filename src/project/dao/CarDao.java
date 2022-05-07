package project.dao;

import project.models.Car;

import java.util.List;

public interface CarDao {

    void addCar(Car car);

    List<Car> getAllCars();

    // взяти ставку по індексу
    Car getCar(int index);

}
