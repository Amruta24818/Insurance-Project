package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.PlanCategory;

public interface IPlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
