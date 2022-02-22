package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Skoda", "Rapid", 2014));
        cars.add(new Car("Volkswagen", "Passat", 2002));
        cars.add(new Car("Mitsubishi", "Pajero", 2008));
        cars.add(new Car("Toyota", "Prado", 1986));
        cars.add(new Car("Audi", "A6", 2020));
    }

    @Override
    public List<Car> getCarList(int count) {
        int elements = count;

        if (count > cars.size()) {
            elements = cars.size();
        }
        return cars.subList(0, elements);
    }
}
