package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.model.Plan;

public interface PlanService {
	public Map<Integer, String> getPlanCategories();
	
	public boolean upsertPlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public Plan getPlanById(Integer planId);
	
	public boolean deletePlanById(Integer planId);
	
	public boolean planStatusChange(Integer PlanId, String activeSw);

}
