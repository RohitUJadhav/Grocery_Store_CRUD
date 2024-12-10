package com.gigabyte.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gigabyte.grocery.DAO.groceryDAO;
import com.gigabyte.grocery.DAO.updateGroceryDAO;
import com.gigabyte.grocery.service.groceryServices;

@Controller
@RequestMapping("/grocery")
public class groceryController {
	
	@Autowired
	groceryServices groceryServices;
	
	@PostMapping("")
	public ResponseEntity<?> createpro (@RequestBody groceryDAO DAO){
		return ResponseEntity.ok(this.groceryServices.create(DAO));
	}
	@GetMapping("")
	public ResponseEntity<?> readRecord(){
		return ResponseEntity.ok(this.groceryServices.readAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> readId(@PathVariable Integer id){
		return ResponseEntity.ok(this.groceryServices.readById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRecord(@PathVariable Integer id, @RequestBody updateGroceryDAO dao){
		return ResponseEntity.ok(this.groceryServices.update(id, dao));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		return ResponseEntity.ok(this.groceryServices.deleteRecord(id));
	}

}
