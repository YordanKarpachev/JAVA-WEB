package com.example.statemanagement.WEB;

import jakarta.servlet.http.Cookie;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

    @GetMapping("/session")
    public String session(HttpSession session, Model model){
      var sessionLang = session.getAttribute("lang");
      model.addAttribute("lang", sessionLang != null ? sessionLang : "en");

        return "session";
    }

    @PostMapping("/session")

    public String cookies(HttpSession session , @RequestParam(name = "language") String language) {

      session.setAttribute("lang", language);


        return "redirect:/session";

    }

}
