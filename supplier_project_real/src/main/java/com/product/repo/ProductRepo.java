package com.product.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.ManufacturingProcesses;
import com.product.entity.NatureOfBusiness;
import com.product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	public List<Product> findByLocationAndNatureOfBusinessAndManufacturingProcesses(String Location,NatureOfBusiness natureOfBusiness,ManufacturingProcesses manufacturingProcesses);

}
