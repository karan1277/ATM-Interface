import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    public DashboardPanel(ATMFrame frame, UserAccount account) {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 245));

        JLabel cityLabel = new JLabel("Welcome - ATM Location: " + account.getCity(), SwingConstants.CENTER);
        cityLabel.setFont(new Font("Arial", Font.BOLD, 16));
        cityLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1, 10, 10));

        JButton historyBtn = new JButton("Transaction History");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton depositBtn = new JButton("Deposit");
        JButton transferBtn = new JButton("Transfer");
        JButton balanceBtn = new JButton("Check Balance");
        JButton quitBtn = new JButton("Quit");

        buttonPanel.add(historyBtn);
        buttonPanel.add(withdrawBtn);
        buttonPanel.add(depositBtn);
        buttonPanel.add(transferBtn);
        buttonPanel.add(balanceBtn);
        buttonPanel.add(quitBtn);

        add(cityLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        historyBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        account.getTransactionHistory()));

        withdrawBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog("Enter amount:");
            double amount = Double.parseDouble(amountStr);
            if (account.withdraw(amount))
                JOptionPane.showMessageDialog(this, "Withdraw Successful");
            else
                JOptionPane.showMessageDialog(this, "Insufficient Balance");
        });

        depositBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog("Enter amount:");
            double amount = Double.parseDouble(amountStr);
            account.deposit(amount);
            JOptionPane.showMessageDialog(this, "Deposit Successful");
        });

        transferBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog("Enter amount:");
            double amount = Double.parseDouble(amountStr);
            if (account.transfer(amount))
                JOptionPane.showMessageDialog(this, "Transfer Successful");
            else
                JOptionPane.showMessageDialog(this, "Insufficient Balance");
        });

        balanceBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Current Balance: ₹" + account.getBalance()));

        quitBtn.addActionListener(e -> System.exit(0));
    }
}
