package com.blueaken.springmvc.service;

import com.blueaken.springmvc.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Author: blueaken
 * Date: 8/7/14 11:23 下午
 */
public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}
