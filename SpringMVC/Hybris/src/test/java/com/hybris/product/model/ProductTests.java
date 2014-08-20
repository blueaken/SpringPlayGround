package com.hybris.product.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ProductTests {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
    }

    @Test
    public void testSetAndGetSKU() {
        String testSKU = "someSKU";
        assertNull(product.getSku());
        product.setSku(testSKU);
        assertEquals(testSKU, product.getSku());
    }

    @Test
    public void testSetAndGetColor() {
        String testColor = "BLUE";
        assertNull(product.getColor());
        product.setColor(testColor);
        assertEquals(testColor, product.getColor());
    }

    @Test
    public void testSetAndGetName() {
        String testName = "aName";
        assertNull(product.getName());
        product.setName(testName);
        assertEquals(testName, product.getName());
    }

    @Test
    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    @Test
    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

}
