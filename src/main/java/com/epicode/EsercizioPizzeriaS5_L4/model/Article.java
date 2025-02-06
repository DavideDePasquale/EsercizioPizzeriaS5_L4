package com.epicode.EsercizioPizzeriaS5_L4.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Article {

    @Id
    @GeneratedValue
    protected Long id;
    @Column(nullable = false)
    protected int calories;
    @Column(nullable = false)
    protected double price;

    public Article() {
    }

    public Article(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
