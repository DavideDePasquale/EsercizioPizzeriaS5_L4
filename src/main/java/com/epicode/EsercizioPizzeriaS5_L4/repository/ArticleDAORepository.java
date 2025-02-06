package com.epicode.EsercizioPizzeriaS5_L4.repository;

import com.epicode.EsercizioPizzeriaS5_L4.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDAORepository extends JpaRepository<Article,Long> {

}
