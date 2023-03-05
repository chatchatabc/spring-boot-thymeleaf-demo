package org.mvnsearch.thymeleaf.demo;

import io.github.wimdeblauwe.hsbt.mvc.HtmxRequest;
import io.github.wimdeblauwe.hsbt.mvc.HxRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("user", "Admin");
        return "index";
    }

    @GetMapping("/hello")
    @HxRequest
    public String hello(HtmxRequest htmxRequest, Model model) {
        return "partials/hello";
    }
}
