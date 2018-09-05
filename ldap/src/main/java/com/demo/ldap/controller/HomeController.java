package com.demo.ldap.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    @RequestMapping ( value = {"/login"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String loginPage() {
        return "login";
    }

    /**
     * Getting the user name of the logged in user
     */
    private String getUserPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }

        return userName;
    }
}
