package com.product.service;

import java.util.List;

import com.product.entity.ManufacturingProcesses;
import com.product.entity.NatureOfBusiness;
import com.product.entity.Product;

public interface ProductService {
	
	public String addProduct(Product product);
	
	public List<Product> getProduct();
	
	public List<Product> specialProduct(String Location,NatureOfBusiness natureOfBusiness,ManufacturingProcesses manufacturingProcesses);

}
