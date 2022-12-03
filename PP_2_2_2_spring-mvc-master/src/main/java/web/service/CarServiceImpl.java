package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Black", 1999));
        cars.add(new Car("Chevrolet", "Yellow", 1977));
        cars.add(new Car("lamborghini", "White", 2019));
        cars.add(new Car("Ferrari", "Red", 2019));
        cars.add(new Car("Mercedes", "Black", 2010));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
