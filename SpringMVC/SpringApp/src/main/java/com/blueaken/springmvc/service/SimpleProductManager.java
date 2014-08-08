package com.blueaken.springmvc.service;

import com.blueaken.springmvc.domain.Product;

import java.util.List;

/**
 * Author: blueaken
 * Date: 8/7/14 11:24 下午
 */
public class SimpleProductManager implements ProductManager {

    public List<Product> getProducts() {
        throw new UnsupportedOperationException();
    }

    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException();
    }

    public void setProducts(List<Product> products) {
        throw new UnsupportedOperationException();
    }

}
