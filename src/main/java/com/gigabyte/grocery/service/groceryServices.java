package com.gigabyte.grocery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gigabyte.grocery.DAO.groceryDAO;
import com.gigabyte.grocery.DAO.updateGroceryDAO;
import com.gigabyte.grocery.entity.grocery;
import com.gigabyte.grocery.groceryRepository.groceryRepository;

@Service
public class groceryServices {
	
	@Autowired
	groceryRepository groceryRepo;
	
	
	public grocery create(groceryDAO DAO) {
		grocery grocery = new grocery();
		
		grocery.setProduct_name(DAO.getProduct_name());
		grocery.setPrice(DAO.getPrice());
		grocery.setQuantity(DAO.getQuantity());
		grocery.setManufacture_date(DAO.getManufacture_date());
		grocery.setExpire_date(DAO.getExpire_date());
		this.groceryRepo.save(grocery);
		return grocery;
		
	}
	
	public List<grocery> readAll (){
		List<grocery>productInfo = new ArrayList<grocery>();
		productInfo = this.groceryRepo.findAll();
		return productInfo;
	}
	
	public grocery readById(Integer id) {
		grocery grocery = new grocery();
		grocery = this.groceryRepo.findById(id).orElse(null);
		return grocery;
		
	}
	
	public grocery update (Integer id, updateGroceryDAO updatedao) {
		grocery grocery = new grocery();
		grocery = this.readById(id);
		
		if(updatedao.getProduct_name() != null) {
			grocery.setProduct_name(updatedao.getProduct_name());
		}
		if(updatedao.getPrice() != null) {
			grocery.setPrice(updatedao.getPrice());
		}
		if(updatedao.getQuantity() != null) {
			grocery.setQuantity(updatedao.getQuantity());
			
		}
		if(updatedao.getManufacture_date() != null) {
			grocery.setManufacture_date(updatedao.getManufacture_date());
		}
		if(updatedao.getExpire_date() != null) {
			grocery.setExpire_date(updatedao.getExpire_date());
		}
		
		this.groceryRepo.save(grocery);
		return grocery;
		
		
	}
	
	public String deleteRecord(Integer id) {
		this.groceryRepo.deleteById(id);
		return "Delete SuceessFully";
		
	}

}
