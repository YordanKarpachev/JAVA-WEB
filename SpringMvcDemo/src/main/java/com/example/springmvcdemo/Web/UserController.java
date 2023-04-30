package com.example.springmvcdemo.Web;

import com.example.springmvcdemo.model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String newUser(){

        return "newUser";
    }

    /*
    @GetMapping("/hello")
  //variante 1

     public String hello(Model model){
      model.addAttribute("num", 233);
      return "newUser";}




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




    @PostMapping
    public String createUser(UserDTO userDTO){
        System.out.println("Createing new User.... " + userDTO);

        return "createdUser";
    }
}
