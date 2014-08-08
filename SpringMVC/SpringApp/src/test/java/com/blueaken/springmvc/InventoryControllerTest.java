package com.blueaken.springmvc;

import com.blueaken.springmvc.service.SimpleProductManager;
import com.blueaken.springmvc.web.InventoryController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author jianshen
 */
public class InventoryControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());

        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}

