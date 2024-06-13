package com.raman.designpatterns.structural.facade.scenerio2.system;

import com.raman.designpatterns.structural.facade.scenerio2.system.Product;

public class ProductDAO {
    public Product getProduct(int productId) {
        return new Product();
    }
}
