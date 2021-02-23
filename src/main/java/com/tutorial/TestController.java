package com.tutorial;

import com.service.MainService;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    MainService mainService;

    @GetMapping(value = "/")
    public String index(ModelMap modelMap){
        return "index";
    }

    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){
        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World and Welcome to Spring MVC!");
        modelMap.addAttribute("random_number", testService.getRandomNumber());
        // return the name of the file to be loaded "hello_world.jsp"
        return "hello_world";
    }

    @GetMapping(value = "/dashboard")
    public ModelAndView getDashboard(@RequestParam(value = "name", required = false, defaultValue = "Marcus") String name){
        ModelAndView mv = new ModelAndView("templates/dashboard");
        mv.addObject("block1","This is block 1");
        mv.addObject("block2","This is block 2");
        mv.addObject("country", testService.getCountrOfOrigin(name));
        mv.addObject("somestr", mainService.generateString());
        return mv;
    }

}