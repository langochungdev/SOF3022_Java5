package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RectangleController {

    @RequestMapping("/rectangle/form")
    public String form() {
        return "rectangle";
    }

    @RequestMapping("/rectangle/calc")
    public String calc(HttpServletRequest request, Model model) {
        try {
            double width = Double.parseDouble(request.getParameter("width"));
            double height = Double.parseDouble(request.getParameter("height"));

            double area = width * height;
            double perimeter = 2 * (width + height);

            model.addAttribute("width", width);
            model.addAttribute("height", height);
            model.addAttribute("area", area);
            model.addAttribute("perimeter", perimeter);
        } catch (Exception e) {
            model.addAttribute("error", "Vui lòng nhập đúng số!");
        }

        return "rectangle";
    }

}
