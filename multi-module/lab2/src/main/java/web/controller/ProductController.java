package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.entity.Product;

import java.util.*;

@Controller
public class ProductController {

    // Danh sách sản phẩm động
    private List<Product> items = new ArrayList<>(List.of(
            new Product("A", 1.0),
            new Product("B", 12.0)
    ));

    @GetMapping("/product/form")
    public String form(Model model) {
        Product p = new Product();
        p.setName("iPhone 30");
        p.setPrice(5000.0);
        model.addAttribute("product", p);
        model.addAttribute("items", items);
        return "form";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("product") Product p, Model model) {
        items.add(p); // thêm vào danh sách
        model.addAttribute("product", p);
        model.addAttribute("items", items);
        return "form";
    }
}
