package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<> ();

    public CarServiceImpl() {
        cars.add (new Car ("Kia", "black", 2022));
        cars.add (new Car ("Hyundai", "white", 2017));
        cars.add (new Car ("BMW", "Gray", 2015));
        cars.add (new Car ("Mercedes", "black", 2023));
        cars.add (new Car ("Audi", "yellow", 2024));
    }


    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= 0 && count <= cars.size()) {
            return cars.subList (0, count);
        } else {
            return Collections.emptyList ();
        }
    }
}
