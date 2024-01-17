package rvt.DefaultController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
// @GetMapping(value = "/")
    // ModelAndView index() {

@GetMapping(value="/about")
ModelAndView about(@RequestParam HashMap<String, String> queryStringParams) {

        ModelAndView modelAndView = new ModelAndView("about");
        
        String id = queryStringParams.get("id");
        String title = queryStringParams.get("title");

        return modelAndView;

} 
}