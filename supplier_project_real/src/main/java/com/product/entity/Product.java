package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String url;
	private String location;
	@Enumerated(EnumType.STRING)
	private NatureOfBusiness natureOfBusiness;
	@Enumerated(EnumType.STRING)
	private ManufacturingProcesses manufacturingProcesses;
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public NatureOfBusiness getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public ManufacturingProcesses getManufacturingProcesses() {
		return manufacturingProcesses;
	}
	public void setManufacturingProcesses(ManufacturingProcesses manufacturingProcesses) {
		this.manufacturingProcesses = manufacturingProcesses;
	}
	
	
	
	
	
	

}
