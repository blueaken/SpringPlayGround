package com.hybris.product.controller;

import com.hybris.product.model.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jianshen
 */
public class ProductFormController extends SimpleFormController{

    protected final Log logger = LogFactory.getLog(getClass());

    public ProductFormController(){
        setCommandClass(Product.class);
        setCommandName("productForm");
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,
                                    HttpServletResponse response, Object command, BindException errors) throws Exception {
        Product product = (Product)command;
        logger.info("********* @@@@@@@@@@ ########## Cart Product info - Product SKU: " + product.getSku());

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("product", product);

        return new ModelAndView("productDetails", "model", myModel);
    }
}
