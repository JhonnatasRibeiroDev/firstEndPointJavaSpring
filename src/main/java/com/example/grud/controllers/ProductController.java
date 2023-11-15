package com.example.grud.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa anotação indica que a classe é um controller
public class ProductController {
    ArrayList<Product> products = new ArrayList<Product>();

    @RequestMapping("/products") // Essa anotação indica que o método abaixo será chamado quando a URL for "/"
    public ArrayList<Product> getProduct() {
        if (products.isEmpty()) {
            products.add(new Product("Bola", "Bola de futebol", 10.0, 10));
            products.add(new Product("Camiseta", "Camiseta esportiva", 20.0, 5));
            products.add(new Product("Tênis", "Tênis de corrida", 50.0, 3));
            products.add(new Product("Luvas", "Luvas de goleiro", 15.0, 8));
            products.add(new Product("Rede", "Rede de futebol", 30.0, 2));
        }
        return products;
    }

}