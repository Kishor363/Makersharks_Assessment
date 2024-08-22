package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ManufacturingProcesses;
import com.product.entity.NatureOfBusiness;
import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/v1/api")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		String msg=productService.addProduct(product);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/allProduct")
	public ResponseEntity<List<Product>> getProduct(){
		List<Product> products=productService.getProduct();
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/specific/{location}/{natureOfBusiness}/{manufacturingProcesses}")
	public ResponseEntity<List<Product>> someProd(@PathVariable String location,@PathVariable NatureOfBusiness natureOfBusiness,@PathVariable ManufacturingProcesses manufacturingProcesses){
		List<Product> products=productService.specialProduct(location, natureOfBusiness, manufacturingProcesses);
		return ResponseEntity.ok(products);
	}

}
