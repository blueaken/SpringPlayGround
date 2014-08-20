package com.hybris.product.controller;


import com.hybris.product.model.HybrisProductManager;
import com.hybris.product.model.Product;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author jianshen
 */
public class ProductControllerTests {
    @Test
    public void testHandleRequestView() throws Exception{
        ProductController controller = new ProductController();
        controller.setProductManager(new HybrisProductManager());

        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("products", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        List<Product> products = (List<Product>) modelMap.get("products");
        assertNull(products);
    }
}
