package ATM;

import java.util.Objects;

public class Account {
    String name;
    String encryptedPassword;
    double balance;

    public Account(String name, String encryptedPassword, double balance) {
        this.name = Objects.requireNonNull(name);
        this.encryptedPassword = Objects.requireNonNull(encryptedPassword);
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isMatching(String name, String encryptedPassword) {
        return Objects.equals(this.name, name) &&
                Objects.equals(this.encryptedPassword, encryptedPassword);
    }

    public boolean depositMoney(double amount) {
        if (amount > 0)
            balance += amount;
        return true;
    }

    public boolean withdrawMoney(double amount) {
        if (amount > 0)
            balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Your Balance is $%.2f", balance);
    }
}
