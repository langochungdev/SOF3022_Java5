package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // thêm import này
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web.bean.CookieService;
import web.bean.ParamService;
import web.bean.SessionService;

@Controller
public class AccountController {
    @Autowired
    CookieService cookieService;
    @Autowired
    ParamService paramService;
    @Autowired
    SessionService sessionService;

    @GetMapping("/account/login")
    public String login1() {
        return "account/login";
    }

    @PostMapping("/account/login")
    public String login2(Model model) { // thêm Model để gửi thông báo
        String un = paramService.getString("username", "");
        String pw = paramService.getString("password", "");
        boolean rm = paramService.getBoolean("remember", false);

        if ("hung".equals(un) && "123".equals(pw)) {
            sessionService.set("username", un);
            if (rm) {
                cookieService.add("user", un, 24 * 10); // 10 ngày
            } else {
                cookieService.remove("user");
            }
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
        }
        return "account/login";
    }
}
