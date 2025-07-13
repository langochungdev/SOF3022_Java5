package web.bean;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ParamService {
    @jakarta.annotation.Resource
    HttpServletRequest request;

    public String getString(String name, String defaultValue) {
        String value = request.getParameter(name);
        return value != null ? value : defaultValue;
    }

    public int getInt(String name, int defaultValue) {
        try {
            return Integer.parseInt(request.getParameter(name));
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public double getDouble(String name, double defaultValue) {
        try {
            return Double.parseDouble(request.getParameter(name));
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public boolean getBoolean(String name, boolean defaultValue) {
        String value = request.getParameter(name);
        return value != null ? Boolean.parseBoolean(value) : defaultValue;
    }

    public Date getDate(String name, String pattern) {
        String value = request.getParameter(name);
        if (value == null) return null;
        try {
            return new SimpleDateFormat(pattern).parse(value);
        } catch (Exception e) {
            throw new RuntimeException("Sai định dạng ngày!");
        }
    }

    public File save(MultipartFile file, String path) {
        if (!file.isEmpty()) {
            try {
                String realPath = request.getServletContext().getRealPath(path);
                File savedFile = new File(realPath, file.getOriginalFilename());
                file.transferTo(savedFile);
                return savedFile;
            } catch (Exception e) {
                throw new RuntimeException("Lỗi lưu file!");
            }
        }
        return null;
    }
}
