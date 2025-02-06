package com.epicode.EsercizioPizzeriaS5_L4.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "toppings")
public class Topping extends Article{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public Topping() {
        super();
    }

    public Topping(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pizza=" + pizza +
                ", id=" + id +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
