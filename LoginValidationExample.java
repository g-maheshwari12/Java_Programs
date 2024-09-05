import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginValidationExample {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Validation Example");
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                char[] enteredPasswordChars = passwordField.getPassword();
                String enteredPassword = new String(enteredPasswordChars);

                if (enteredUsername.equals(VALID_USERNAME) && enteredPassword.equals(VALID_PASSWORD)) {
                    JOptionPane.showMessageDialog(frame, "Validation is Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Validation Unsuccessful");
                }

                // Clear the fields after validation
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
