package com.example.springmvcdemo.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
  //variante 1

     public String hello(Model model){
      model.addAttribute("num", 233);
      return "HalloWorld";}




    /*  VARIANTE 2
    public String hello(ModelMap model){
        model.addAttribute("num", 222);
        return "HalloWorld";
    }

    */



  /*     VARIANTE 3
    public ModelAndView hello(ModelAndView model) {
        model.addObject("num", 33);
        model.setViewName("HalloWorld");

        return model;
    } */
}
