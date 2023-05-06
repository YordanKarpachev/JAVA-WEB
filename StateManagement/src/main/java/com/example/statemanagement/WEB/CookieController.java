package com.example.statemanagement.WEB;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CookieController {



    @GetMapping("/cookies")

   public String cookies(Model model, @CookieValue(name = "lang", defaultValue = "en")String value){

        model.addAttribute("lang", value);
     return "cookies";
   }


 //   @PostMapping("/cookies")
  //  public String cookies(){
   //     return "redirect:/cookies";
  //  }

}
