package com.epicode.EsercizioPizzeriaS5_L4.repository;

import com.epicode.EsercizioPizzeriaS5_L4.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkDAORepository extends JpaRepository<Drink,Long> {
}
