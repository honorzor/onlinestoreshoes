package ru.honorzor.shoesshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.honorzor.shoesshop.service.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/")
    public String mainPage(Model model) {
        return "main-page";
    }

    @GetMapping("/product")
    public String findAll(Model model) {
        model.addAttribute("product", productService.findAll());
        return "product";
    }

    @GetMapping("/product/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product";
    }

  /*  @GetMapping("/product/{name}")
    public String sortByName(@PathVariable String name, Model model) {
        List<Product> products = productService.sortByName(name);
        model.addAttribute("product", products);
        return "product";
    }*/


}
