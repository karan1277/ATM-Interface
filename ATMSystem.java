import javax.swing.*;

public class ATMSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ATMFrame frame = new ATMFrame();
            frame.setVisible(true);
        });
    }
}
