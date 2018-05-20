package edu.ascending.training.car.domain;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Created by ryo on 5/20/18.
 */
@Entity
@Table(name="cars")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="cars_id_seq")
    @SequenceGenerator(name="cars_id_seq", sequenceName="cars_id_seq", allocationSize=1)
    private Long id;

    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;

    public Car(){}

    public Car(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
