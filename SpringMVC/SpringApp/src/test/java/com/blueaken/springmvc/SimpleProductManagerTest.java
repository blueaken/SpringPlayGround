package com.blueaken.springmvc;

import com.blueaken.springmvc.service.SimpleProductManager;
import org.junit.Test;
import static org.junit.Assert.assertNull;

/**
 * Author: blueaken
 * Date: 8/7/14 11:26 下午
 */
public class SimpleProductManagerTest {

    private SimpleProductManager productManager = new SimpleProductManager();

    @Test
    public void testGetProductsWithNoProducts() {
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }

}
