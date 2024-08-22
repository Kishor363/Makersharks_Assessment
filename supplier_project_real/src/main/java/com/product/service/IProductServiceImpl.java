package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ManufacturingProcesses;
import com.product.entity.NatureOfBusiness;
import com.product.entity.Product;
import com.product.repo.ProductRepo;


@Service
public class IProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public String addProduct(Product product) {
		productRepo.save(product);
		return "The product is saved having product id " +product.getProductId();
	}

	@Override
	public List<Product> getProduct() {
		List<Product> productList=productRepo.findAll();
		return productList;
	}

	@Override
	public List<Product> specialProduct(String Location, NatureOfBusiness natureOfBusiness,
			ManufacturingProcesses manufacturingProcesses) {
		List<Product> someProd=productRepo.findByLocationAndNatureOfBusinessAndManufacturingProcesses(Location, natureOfBusiness, manufacturingProcesses);
		return someProd;
	}

}
