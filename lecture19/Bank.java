//values: accounts, total balance, name, interest rates
//behaviors: deposit, withdraw, addInterest, getAccountBalance,
//  isAccountOverdrafted

public class Bank {
    String name;
    double totalBalance;
    int numAccounts;
    BankAccount[] accounts;
    double interestRate;

    public Bank() {
        name = "NEW BANK!";
        totalBalance = 0;
        numAccounts = 5;
        accounts = new BankAccount[5];
        interestRate = .0525;
    }

    public Bank(String name, int numNewAccounts) {
        this.name = name;
        totalBalance = 0;
        numAccounts = numNewAccounts;
        accounts = new BankAccount[numAccounts];
        interestRate = .0525;
    }

    public void addAccount(String name, String type, double balance) {
        accounts[numAccounts] = new BankAccount(1, type, name);
    }

    public String getName() {
        return name;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setName(String n) {
        name = n;
    }

    public void deposit(double amount, int accountNum) {
        accounts[accountNum].setBalance(accounts[accountNum].getBalance() + amount);                
        totalBalance += amount;
    }

    public void withdraw(double amount, int accountNum) {
        //overdraft check
        if (accounts[accountNum].getBalance() < amount) {
            System.out.println("Account balance insufficient");
            return;
        }

        BankAccount acc = accounts[accountNum];

        acc.setBalance(acc.getBalance() - amount);
        //totalBalance -= amount;
    }

    public void addInterest() {
        for (int i=0; i<accounts.length; i++) {
            //accounts[i] *= (1 + interestRate);
            BankAccount acc = accounts[i];
            double accBalance = acc.getBalance();
            acc.setBalance(accBalance * (1 + interestRate));
        }

        totalBalance *= (1 + interestRate);
    }

    public double getAccountBalance(int accountNum) {
        return accounts[accountNum].getBalance();
    }

    public String toString() {
        String out = "";
    
        out += getName();
        out += " with balance " + totalBalance;

        return out;
    }

    public boolean accountExists(String name) {
        //search for an account with the name: name

        for (int i=0; i<accounts.length; i++) {
            if (accounts[i].getName().equals(name)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Bank bmcBank = new Bank("Bryn Mawr College Bank", 14);
        System.out.println(bmcBank);
        bmcBank.deposit(1000, 2);
        System.out.println(bmcBank);

        bmcBank.addInterest();
        System.out.println(bmcBank);

        bmcBank.withdraw(500, 0);
        System.out.println(bmcBank);

    }
}
