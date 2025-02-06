package com.epicode.EsercizioPizzeriaS5_L4.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "drinks")
public class Drink extends Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

}
