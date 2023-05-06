package com.example.statemanagement.WEB;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CookieController {


    @GetMapping("/cookies")

    public String cookies(Model model, @CookieValue(name = "lang", defaultValue = "en") String value) {

        model.addAttribute("lang", value);
        return "cookies";
    }


    @PostMapping("/cookies")

    public String cookies(HttpServletResponse httpServletResponse, @RequestParam(name = "language") String language) {

        Cookie cookie = new Cookie("lang", language);

        httpServletResponse.addCookie(cookie);

        return "redirect:/cookies";

    }

}
