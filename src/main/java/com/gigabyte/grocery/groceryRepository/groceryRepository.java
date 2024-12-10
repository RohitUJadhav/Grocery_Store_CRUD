package com.gigabyte.grocery.groceryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gigabyte.grocery.entity.grocery;

@Repository
public interface groceryRepository extends JpaRepository<grocery ,Integer > {

}
