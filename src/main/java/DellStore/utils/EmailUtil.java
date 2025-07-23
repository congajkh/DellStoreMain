package DellStore.utils;

import java.text.Normalizer;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtil {

    public static void sendAccountInfo(String toEmail, String username, String password) throws Exception {
        final String fromEmail = "docong989@gmail.com"; // thay bằng email thật
        final String appPassword = "kwuqvnpysooweqjj";  // mật khẩu ứng dụng

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, appPassword);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        message.setSubject("Tài khoản nhân viên được tạo");

        String content = "Xin chào,\n\n" +
                         "Tai khoan cua ban da duoc tao:\n" +
                         "tai khoan: " + username + "\n" +
                         "mat khau: " + password + "\n\n" +
                         "cam on ban da den voi shop Dellstore.com \n\n" +
                         "Tran Trong.";
        message.setText(content);
        Transport.send(message);
    }

    public static String generateRandomPassword() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int idx = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(idx));
        }
        return sb.toString();
    }

    public static String generateTaiKhoan(String tenNV, String maNV) {
        if (tenNV == null || maNV == null) return null;

        // Loại bỏ dấu tiếng Việt và chuyển thành chữ thường
        String tenKhongDau = removeVietnameseTones(tenNV).toLowerCase();

        // Tách từ
        String[] parts = tenKhongDau.trim().split("\\s+");
        if (parts.length == 0) return null;

        // Lấy phần viết tắt của họ lót
        String hoVietTat = "";
        for (int i = 0; i < parts.length - 1; i++) {
            hoVietTat += parts[i].charAt(0);
        }

        String ten = parts[parts.length - 1]; // phần tên chính
        return ten + hoVietTat + maNV; // ví dụ: congdcNV001
    }

    // Hàm xóa dấu tiếng Việt
    public static String removeVietnameseTones(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");
    }
}

