package se.jensen.sandra.fakestoreproject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.jensen.sandra.fakestoreproject1.model.Product;
import se.jensen.sandra.fakestoreproject1.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/fetch")
    public List<Product> fetchProducts() {
        return service.fetchAndSaveProducts();
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

}
