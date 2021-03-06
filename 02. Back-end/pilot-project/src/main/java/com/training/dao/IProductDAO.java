package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.training.entity.ProductEntity;

@Repository("productRepository")
public interface IProductDAO
		extends JpaRepository<ProductEntity, Long>, JpaSpecificationExecutor<ProductEntity> {

	ProductEntity findByProductId(Long prodId);

	ProductEntity findByProductName(String prodName);

	ProductEntity findByProductNameAndProductIdNot(String prodName, Long prodId);
	
}
