package web.bean;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

@Service
public class CookieService {
    @jakarta.annotation.Resource
    HttpServletRequest request;
    @jakarta.annotation.Resource
    HttpServletResponse response;

    public Cookie get(String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equalsIgnoreCase(name)) {
                return cookie;
            }
        }
        return null;
    }

    public String getValue(String name) {
        Cookie cookie = get(name);
        return cookie != null ? cookie.getValue() : "";
    }

    public Cookie add(String name, String value, int hours) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(hours * 3600);
        cookie.setPath("/");
        response.addCookie(cookie);
        return cookie;
    }

    public void remove(String name) {
        add(name, "", 0);
    }
}
