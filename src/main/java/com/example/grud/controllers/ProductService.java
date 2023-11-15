package com.example.grud.controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    

    private final List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product newProduct) {
        // Lógica de validação pode ser adicionada aqui, se necessário
        // Exemplo simples: Verifica se o nome do produto já existe
        if (productExists(newProduct.getName())) {
            // Pode lançar uma exceção ou retornar null para indicar falha na adição
            throw new IllegalArgumentException("Produto com esse nome já existe.");
        }

        products.add(newProduct);
        return newProduct;
    }

    // Método auxiliar para verificar se um produto com o mesmo nome já existe
    private boolean productExists(String productName) {
        return products.stream().anyMatch(p -> p.getName().equalsIgnoreCase(productName));
    }
}
