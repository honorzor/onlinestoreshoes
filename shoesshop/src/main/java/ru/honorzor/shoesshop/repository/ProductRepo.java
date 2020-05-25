package ru.honorzor.shoesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.honorzor.shoesshop.model.Product;

import java.util.List;


public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByName(String name);
}
