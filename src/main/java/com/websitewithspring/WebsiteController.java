package com.websitewithspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("zino") // endpoint
    public String showZinoPage() {
        return "pageForZino"; // html file
    }

    @GetMapping("about-us") // endpoint
    public String displayAboutPage() {
        return "about_page"; // html file
    }

    @GetMapping("our-services") // endpoint
    public String displayServicesPage() {
        return "services"; // html file
    }

    @GetMapping("contact-us") // endpoint
    public String displayContactPage() {
        return "contact"; // html file
    }
}
