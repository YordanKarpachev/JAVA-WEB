package com.example.statemanagement.WEB;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CookieController {

    private final String LANG_COOKIE_NAME = "lang";

    @GetMapping("/cookies")

   public String cookies(Model model){
        model.addAttribute("lang", "en");
     return "cookiesHTML";
   }


 //   @PostMapping("/cookies")
  //  public String cookies(){
   //     return "redirect:/cookies";
  //  }

}
