package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars(){
        cars.add(new Car("Toyota", "Camry"));
        cars.add(new Car("Kia", "Optima"));
        cars.add(new Car("Lada", "Largus"));
        return cars;
    }
}
