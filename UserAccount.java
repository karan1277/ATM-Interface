import java.util.ArrayList;

public class UserAccount {
    private String userId = "user123";
    private String pin = "1234";
    private double balance = 10000;
    private String city;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public boolean validate(String userId, String pin) {
        return this.userId.equals(userId) && this.pin.equals(pin);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited ₹" + amount + " at " + city);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn ₹" + amount + " at " + city);
            return true;
        }
        return false;
    }

    public boolean transfer(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Transferred ₹" + amount + " from " + city);
            return true;
        }
        return false;
    }

    public String getTransactionHistory() {
        if (transactionHistory.isEmpty())
            return "No transactions yet.";
        return String.join("\n", transactionHistory);
    }
}
