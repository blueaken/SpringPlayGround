package com.blueaken.springmvc.staticpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jianshen
 */

@Controller
public class StaticPageController {

    @RequestMapping(value = "/staticindex", method = RequestMethod.GET)
    public String index() {
        return "staticindex";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {

        return "redirect:/pages/final.htm";
    }
}