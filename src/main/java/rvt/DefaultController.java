package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
@GetMapping(value = "/test")
@ResponseBody 
public String TestAction() {

    String name1 = "John";
    String name2 = "John2";
    String name3 = "John3"; 

    return name1 + "<hr>" + name2 + "<hr>" + name3 + "<hr>";
}
    
@GetMapping(value="/about")
ModelAndView about(@RequestParam HashMap<String, String> queryStringParams) {

        // ModelAndView modelAndView = new ModelAndView("about");
        
        // String id = queryStringParams.get("id");
        // String title = queryStringParams.get("title");

        // return modelAndView;

        A a = new A();
        B b = new B(); 
        C c = new C(); 

        a.a(); 
        b.b(); 
        c.c(); 
        c.a(); 
        c.b(); 
        c.c(); 

} 
}