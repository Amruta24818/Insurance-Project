/**
 * 
 */
package com.example.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Plan;
import com.example.model.PlanCategory;
import com.example.repo.IPlan;
import com.example.repo.IPlanCategoryRepo;

/**
 * @author Amruta
 *
 */
@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private IPlan planRepo;
	
	@Autowired
	private IPlanCategoryRepo planCategoryRepo;
	
	@Override
	public Map<Integer, String> getPlanCategories() {
		
		List<PlanCategory> categories = planCategoryRepo.findAll();
		Map<Integer, String> categoryMap = new HashMap<>();
		
		categories.forEach(category -> {
			categoryMap.put(category.getCategoryId(), category.getCategoryName());
		});
		return categoryMap;
	}

	@Override
	public boolean upsertPlan(Plan plan) {
		Plan saved = planRepo.save(plan);
		return saved.getPlanId() != null;
	}

	@Override
	public List<Plan> getAllPlans() {
		return planRepo.findAll();
	}

	@Override
	public Plan getPlanById(Integer planId) {
		Optional<Plan> findById = planRepo.findById(planId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deletePlanById(Integer planId) {
		boolean status = false;
		try {
			planRepo.deleteById(planId);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public boolean planStatusChange(Integer PlanId, String activeSw) {
		Optional<Plan> findById = planRepo.findById(PlanId);
		if(findById.isPresent()) {
			Plan plan = findById.get();
			plan.setActiveSw(activeSw);
			planRepo.save(plan);
			return true;
		}
		return false;
	}

}
