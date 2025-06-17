package com.devsuperior.dsCommerce.repositories;

import com.devsuperior.dsCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
