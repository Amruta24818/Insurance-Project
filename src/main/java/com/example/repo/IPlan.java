package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Plan;

@Repository
public interface IPlan extends JpaRepository<Plan, Integer> {

}
