package com.hybris.product.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jianshen
 */
public class HybrisProductManagerTests {
    private HybrisProductManager productManager = new HybrisProductManager();
    private List<Product> products = new ArrayList<Product>();

    private static int PRODUCT_COUNT = 2;

    private static String WINDOW_SKU = "111";
    private static String WINDOW_COLOR = "BLUE";
    private static String WINDOW_NAME = "Window";
    private static double WINDOW_PRICE = 12.25;
    private static String WINDOW_DESCRIPTION = "jian house's window";

    private static String TABLE_SKU = "222";
    private static String TABLE_COLOR = "RED";
    private static String TABLE_NAME = "Table";
    private static double TABLE_PRICE = 322.25;
    private static String TABLE_DESCRIPTION = "jian house's table";

    private static String SKU_NOT_EXISTING = "not_existing_sku";

    @Before
    public void setUp() throws Exception {
        productManager = new HybrisProductManager();
        products = new ArrayList<Product>();

        // stub up a list of products
        Product product = new Product();
        product.setSku(WINDOW_SKU);
        product.setColor(WINDOW_COLOR);
        product.setName(WINDOW_NAME);
        product.setPrice(WINDOW_PRICE);
        product.setDescription(WINDOW_DESCRIPTION);
        products.add(product);

        product = new Product();
        product.setSku(TABLE_SKU);
        product.setColor(TABLE_COLOR);
        product.setName(TABLE_NAME);
        product.setPrice(TABLE_PRICE);
        product.setDescription(TABLE_DESCRIPTION);
        products.add(product);

        productManager.setProducts(products);
    }

    @Test
    public void testGetProductsWithNoProducts() {
        productManager = new HybrisProductManager();
        assertNull(productManager.getProducts());
    }

    @Test
    public void testGetProducts() {
        List<Product> products = productManager.getProducts();
        assertNotNull(products);
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());

        Product product = products.get(0);
        assertEquals(WINDOW_SKU, product.getSku());
        assertEquals(WINDOW_COLOR, product.getColor());
        assertEquals(WINDOW_NAME, product.getName());
        assertEquals(WINDOW_DESCRIPTION, product.getDescription());
        assertEquals(WINDOW_PRICE, product.getPrice(),0);

        product = products.get(1);
        assertEquals(TABLE_SKU, product.getSku());
        assertEquals(TABLE_COLOR, product.getColor());
        assertEquals(TABLE_NAME, product.getName());
        assertEquals(TABLE_DESCRIPTION, product.getDescription());
        assertEquals(TABLE_PRICE, product.getPrice(),0);
    }

    @Test
    public void testGetProductBySKU() {
        Product product = productManager.getProductBySku(WINDOW_SKU);
        assertEquals(WINDOW_SKU, product.getSku());
        assertEquals(WINDOW_COLOR, product.getColor());
        assertEquals(WINDOW_NAME, product.getName());
        assertEquals(WINDOW_DESCRIPTION, product.getDescription());
        assertEquals(WINDOW_PRICE, product.getPrice(),0);
    }

    @Test
    public void testGetProductBySKU_NOT_EXISTING() {
        Product product = productManager.getProductBySku(SKU_NOT_EXISTING);
        assertNull(product);
    }
}
