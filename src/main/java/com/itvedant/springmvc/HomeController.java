package com.itvedant.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //handles all the client's requests url's and returns the response
public class HomeController {
    @RequestMapping("/") //url mapping
    public String index(){
        return "welcome"; //returning view(html page)
    }
    @RequestMapping("/student") 
    public String student(){
        return "student"; //spring.mvc.view.suffix=".html" property in application.properties will automatically attach .html extension
    }
    @RequestMapping("/home")
    public String home(){
        System.out.println("index");
        return "home";
    }
    @RequestMapping("/aboutus")
    public String aboutus(){
        System.out.println("aboutus");
        return "AboutUs";
    }

}
