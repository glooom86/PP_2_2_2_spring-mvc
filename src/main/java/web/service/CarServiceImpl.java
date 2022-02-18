package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(int count, List<Car> carList) {
        int elements = count;

        if (count > carList.size()) {
            elements = carList.size();
        }
        return carList.subList(0, elements);
    }
}
