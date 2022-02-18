package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carsList (@RequestParam(defaultValue = "5") int count, Model model){
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Skoda", "Rapid", 2014));
        cars.add(new Car("Volkswagen", "Passat", 2002));
        cars.add(new Car("Mitsubishi", "Pajero", 2008));
        cars.add(new Car("Toyota", "Prado", 1986));
        cars.add(new Car("Audi", "A6",2020));

        List<Car> countedCars = carService.getCarList(count, cars);

        model.addAttribute("cars", countedCars);
        return "cars";
    }
}
