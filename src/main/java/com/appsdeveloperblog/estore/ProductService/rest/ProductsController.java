package com.appsdeveloperblog.estore.ProductService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private Environment env;

    @PostMapping
    public String createProduct(){
        return "Create product -> HTTP POST request handled";
    }

    @GetMapping
    public String getProduct(){
        return "Get product -> HTTP GET request handled" + env.getProperty("local.server.port");
    }

    @PutMapping
    public String updateProduct(){
        return "Update product -> HTTP PUT request handled";
    }
    @DeleteMapping
    public String deleteProduct(){
        return "Delete product -> HTTP Delete request handled";
    }
}
