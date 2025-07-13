package web.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.entity.Product;

@Controller
public class ParamController {

    @RequestMapping("/param/form")
    public String form(Model model) {
        model.addAttribute("x", null);
        model.addAttribute("y", null);
        model.addAttribute("product", new Product()); // tránh lỗi Thymeleaf
        model.addAttribute("items", new ArrayList<>()); // tránh lỗi danh sách rỗng
        return "form";
    }

    @PostMapping("/param/save/{x}")
    public String save(@PathVariable("x") String x,
                       @RequestParam("y") String y,
                       Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("product", new Product());
        model.addAttribute("items", new ArrayList<>());
        return "form";
    }
}
