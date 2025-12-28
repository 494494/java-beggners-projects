import javax.swing.*;
import java.awt.event.*;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Strength Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPasswordField passwordField = new JPasswordField(20);
        JLabel strengthLabel = new JLabel("Enter password...");

        passwordField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String password = new String(passwordField.getPassword());
                strengthLabel.setText(checkStrength(password));
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(strengthLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static String checkStrength(String p) {
        int score = 0;
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        if (p.length() >= 8) score++;

        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
            if ("!@#$%^&*_.".indexOf(c) != -1) hasSpecial = true;
        }

        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        if (score == 5) return "✅ Strong password";
        if (score >= 3) return "⚠ Medium password";
        return "❌ Weak password";
    }
}
