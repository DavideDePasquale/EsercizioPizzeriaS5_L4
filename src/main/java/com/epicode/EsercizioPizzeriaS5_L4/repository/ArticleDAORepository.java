package com.epicode.EsercizioPizzeriaS5_L4.repository;

import com.epicode.EsercizioPizzeriaS5_L4.model.Article;
import com.epicode.EsercizioPizzeriaS5_L4.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDAORepository extends JpaRepository<Article,Long> {

   public List<Article> findByCaloriesLessThan(Integer calories);
   public List<Article> findByPriceBetween(double min, double max);
}
