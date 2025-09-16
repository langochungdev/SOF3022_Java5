package com.example.lab4.controller;

import com.example.lab4.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @GetMapping("/create/form")
    public String createForm(Model model, @ModelAttribute("staff") Staff staff) {
        model.addAttribute("message", "Vui lòng nhập thông tin nhân viên!");
        return "/demo/staff-create";
    }

    @PostMapping("/create/save")
    public String createSave(Model model,
                              @RequestPart("photo_file") MultipartFile photoFile,
                              @Valid @ModelAttribute("staff") Staff staff,
                              Errors errors) {

        if (!photoFile.isEmpty()) {
            staff.setPhoto(photoFile.getOriginalFilename());
        }

        if (errors.hasErrors()) {
            model.addAttribute("message", "Vui lòng sửa các lỗi sau!");
            return "/demo/staff-validate";
        } else {
            model.addAttribute("message", "Dữ liệu đã nhập đúng!");
            return "/demo/staff-validate";
        }
    }
}
