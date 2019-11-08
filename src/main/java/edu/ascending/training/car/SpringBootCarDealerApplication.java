package edu.ascending.training.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"edu.ascending.training.car.filter"})
public class SpringBootCarDealerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCarDealerApplication.class, args);
	}
}
