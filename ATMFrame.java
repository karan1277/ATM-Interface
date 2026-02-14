import javax.swing.*;
import java.awt.*;

public class ATMFrame extends JFrame {
    private UserAccount userAccount = new UserAccount();

    public ATMFrame() {
        setTitle("ATM Machine");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        showLoginPanel();
    }

    public void showLoginPanel() {
        setContentPane(new LoginPanel(this, userAccount));
        revalidate();
    }

    public void showDashboard() {
        setContentPane(new DashboardPanel(this, userAccount));
        revalidate();
    }
}
