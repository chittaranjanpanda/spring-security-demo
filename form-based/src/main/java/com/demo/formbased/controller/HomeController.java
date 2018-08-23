package com.demo.formbased.controller;

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

    @RequestMapping ( value = {"/home"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String homePage() {
        return "home";
    }

    @RequestMapping ( value = {"/login"}, method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
}
