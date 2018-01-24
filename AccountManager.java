package ATM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();

    private List<Account> getAccounts() {
        Account tempAccount = new Account("Ritaban", "myPassword", 1000);
        accounts.add(tempAccount);
        return accounts;
    }

    /*private String byteToHex(byte[] byteArr) {

    }*/

    public Account getAccount(String accountName, String password) {
        accounts = getAccounts();
        String encryptedPassword = password.toString();
        for (Account account : accounts) {
            if (account.isMatching(accountName, encryptedPassword)) {
                return account;
            }
        }
        return null;
    }
}
