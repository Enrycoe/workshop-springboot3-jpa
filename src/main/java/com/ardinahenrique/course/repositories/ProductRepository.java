package com.ardinahenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ardinahenrique.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
