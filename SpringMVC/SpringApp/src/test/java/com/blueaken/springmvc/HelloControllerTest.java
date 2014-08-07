package com.blueaken.springmvc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jianshen
 */
public class HelloControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}

