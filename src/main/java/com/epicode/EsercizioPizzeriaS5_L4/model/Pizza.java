package com.epicode.EsercizioPizzeriaS5_L4.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizze")
public class Pizza extends Article {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "pizza")
    private List<Topping> toppingList;

    public Pizza(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
        this.toppingList= new ArrayList<Topping>();
    }

    public Pizza(int calories, double price) {
        super(calories, price);
    }

    public void addTopping(Topping t){
        this.toppingList.add(t);
    }

    public String getName() {
        return name;
    }


    public List<Topping> getToppingList() {
        return toppingList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

}
