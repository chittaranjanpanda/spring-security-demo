package com.demo.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Main controller for login and home
 */
@Controller
public class HomeController {

    @RequestMapping ( value = {"/", "/index"}, method = RequestMethod.GET )
    public String landingPage() {
        return "index";
    }

    @RequestMapping ( value = {"/home"}, method = RequestMethod.GET )
    public String homePage() {
        return "home";
    }
}
