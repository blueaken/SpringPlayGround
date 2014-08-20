package com.hybris.product.model;

import java.io.Serializable;

/**
 * @author jianshen
 */
public class Product implements Serializable {

    private String sku;
    private String color;
    private String name;
    private String description;
    private double price;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: " + name + ";");
        buffer.append("Description: " + description);
        return buffer.toString();
    }
}