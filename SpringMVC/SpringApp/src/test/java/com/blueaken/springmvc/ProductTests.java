package com.blueaken.springmvc;

import com.blueaken.springmvc.domain.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Author: blueaken
 * Date: 8/7/14 11:15 下午
 */
public class ProductTests {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
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
        assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

}
