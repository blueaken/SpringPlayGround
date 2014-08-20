package com.hybris.product.controller;

import com.hybris.product.model.HybrisProductManager;
import com.hybris.product.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author jianshen
 */
public class ProductDetailsControllerTests {

    private HybrisProductManager productManager = new HybrisProductManager();
    private List<Product> products = new ArrayList<Product>();

    private static String WINDOW_SKU = "123";
    private static String WINDOW_COLOR = "BLUE";
    private static String WINDOW_NAME = "Window";
    private static double WINDOW_PRICE = 12.25;
    private static String WINDOW_DESCRIPTION = "jian house's window";

    @Before
    public void setUp() throws Exception {
        productManager = new HybrisProductManager();
        products = new ArrayList<Product>();

        Product product = new Product();
        product.setSku(WINDOW_SKU);
        product.setColor(WINDOW_COLOR);
        product.setName(WINDOW_NAME);
        product.setPrice(WINDOW_PRICE);
        product.setDescription(WINDOW_DESCRIPTION);
        products.add(product);

        productManager.setProducts(products);
    }

    @Test
    public void testHandleRequestView() throws Exception{
        ProductDetailsController controller = new ProductDetailsController();
        controller.setProductManager(productManager);

        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setParameter("sku","123");

        ModelAndView modelAndView = controller.handleRequest(request, null);
        assertEquals("productDetails", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        Product product = (Product) modelMap.get("product");
        assertNotNull(product);
    }
}
