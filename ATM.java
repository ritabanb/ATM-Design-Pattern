package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.nextLine();
        System.out.println("Enter your Password: ");
        String password = console.nextLine();
        Account account = new AccountManager().getAccount(name, password);
        if (account != null) {
            System.out.println(account);
            String flag = "y";
            while(flag.equalsIgnoreCase("y")) {
                System.out.println("1. Withdraw / 2. Deposit");
                int type = console.nextInt();
                System.out.println("Enter Amount: ");
                double amount = console.nextDouble();
                if(type == 1)
                    account.withdrawMoney(amount);
                else if(type == 2)
                    account.depositMoney(amount);
                System.out.println(account);
                System.out.println("y for another transaction: ");
                flag = console.nextLine();
            }
        }
        console.close();
    }
}
