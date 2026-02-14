import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    public LoginPanel(ATMFrame frame, UserAccount account) {
        setLayout(new GridBagLayout());
        setBackground(new Color(30, 144, 255));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        JLabel title = new JLabel("ATM LOGIN");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        JTextField userField = new JTextField(15);
        JPasswordField pinField = new JPasswordField(15);

        // City Dropdown
        String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata"};
        JComboBox<String> cityBox = new JComboBox<>(cities);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);

        gbc.gridx = 0; gbc.gridy = 0;
        add(title, gbc);

        gbc.gridy++;
        add(new JLabel("User ID:"), gbc);
        gbc.gridy++;
        add(userField, gbc);

        gbc.gridy++;
        add(new JLabel("PIN:"), gbc);
        gbc.gridy++;
        add(pinField, gbc);

        gbc.gridy++;
        add(new JLabel("Select City:"), gbc);
        gbc.gridy++;
        add(cityBox, gbc);

        gbc.gridy++;
        add(loginBtn, gbc);

        loginBtn.addActionListener(e -> {
            String userId = userField.getText();
            String pin = new String(pinField.getPassword());
            String selectedCity = (String) cityBox.getSelectedItem();

            if (account.validate(userId, pin)) {
                account.setCity(selectedCity);
                frame.showDashboard();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        });
    }
}
