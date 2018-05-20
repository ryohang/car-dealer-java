package edu.ascending.training.car.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import edu.ascending.training.car.domain.Car;
import edu.ascending.training.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ryo on 5/20/18.
 */
@RestController
@RequestMapping(value = "/api/cars", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarController {

    private static final String template = "Car brand is %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.POST)
    public Car generateCar(@RequestParam(value="brand") String brand,@RequestParam(value="model") String model) {
        Car car = new Car(brand);
        car.setModel(model);
        return carService.save(car);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getCarList() {
        Iterable<Car> iterable = carService.findAll();
        List<Car> list = new ArrayList<>();
        for (Car car : iterable) {
            list.add(car);
        }
        return list;
    }

}
