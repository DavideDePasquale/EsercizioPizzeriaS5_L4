package com.epicode.EsercizioPizzeriaS5_L4.repository;

import com.epicode.EsercizioPizzeriaS5_L4.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingDAORepository extends JpaRepository<Topping,Long> {

}
