package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;

@Controller
public class OkController {

    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }

    @PostMapping("/ctrl/ok")
    public String m1(Model model) {
        model.addAttribute("method", "m1()");
        return "ok";
    }

    @GetMapping("/ctrl/ok")
    public String m2(Model model) {
        model.addAttribute("method", "m2()");
        return "ok";
    }

    @RequestMapping("/ctrl/ok")
    public String m3(@RequestParam(required = false) String x, Model model) {
        if (x != null) {
            model.addAttribute("method", "m3()");
        }
        return "ok";
    }
}
