package edu.ascending.training.car.service;

import edu.ascending.training.car.domain.Car;
import edu.ascending.training.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by ryo on 5/20/18.
 */
@Service
public class CarService extends CrudService<Car,Long> {
    @Autowired
    private CarRepository carRepository;
    @Override
    protected CrudRepository<Car, Long> getCrudRepository() {
        return carRepository;
    }
}
