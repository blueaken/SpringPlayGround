package com.hybris.product.model;

import java.util.List;

/**
 * @author jianshen
 */
public class HybrisProductManager implements ProductManager {

    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductBySku(String sku){
        if (products != null) {
            for (Product product : products) {
                if (product.getSku().equals(sku)){
                    return product;
                }
            }
        }
        return null;
    }

}
