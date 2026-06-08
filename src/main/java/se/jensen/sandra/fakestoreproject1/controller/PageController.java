package se.jensen.sandra.fakestoreproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.jensen.sandra.fakestoreproject1.service.ProductService;

@Controller
public class PageController {

    private final ProductService service;

    public PageController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showProducts(Model model) {

        model.addAttribute("products",
                service.getAllProducts());

        return "products";
    }
}