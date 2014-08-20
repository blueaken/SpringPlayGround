package com.hybris.product.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author jianshen
 */
public interface ProductManager extends Serializable {
    public List<Product> getProducts();
    public Product getProductBySku(String sku);
}
