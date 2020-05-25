package ru.honorzor.shoesshop.service;

import org.springframework.stereotype.Service;
import ru.honorzor.shoesshop.model.Product;
import ru.honorzor.shoesshop.repository.ProductRepo;
import java.util.List;
@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<Product> sortByName(String name){
        return productRepo.findByName(name);
    }

    public Product findById (int id){
        return productRepo.getOne(id);
    }
    public List<Product> findAll (){
        return productRepo.findAll();
    }
}
