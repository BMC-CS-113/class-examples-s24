//values: accounts, total balance, name, interest rates
//behaviors: deposit, withdraw, addInterest, getAccountBalance,
//  isAccountOverdrafted

public class Bank {
    String name;
    double totalBalance;
    int numAccounts;
    double[] accounts;
    double interestRate;

    public Bank() {
        name = "NEW BANK!";
        totalBalance = 0;
        numAccounts = 5;
        accounts = new double[5];
        interestRate = .0525;
    }

    public Bank(String n, int numNewAccounts) {
        name = n;
        totalBalance = 0;
        numAccounts = numNewAccounts;
        accounts = new double[numAccounts];
        interestRate = .0525;
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
        accounts[accountNum] += amount;                
        totalBalance += amount;
    }

    public void withdraw(double amount, int accountNum) {
        //overdraft check
        if (accounts[accountNum] < amount) {
            System.out.println("Account balance insufficient");
            return;
        }

        accounts[accountNum] -= amount;
        totalBalance -= amount;
    }

    public void addInterest() {
        for (int i=0; i<accounts.length; i++) {
            accounts[i] *= (1 + interestRate);
        }

        totalBalance *= (1 + interestRate);
    }

    public double getAccountBalance(int accountNum) {
        return accounts[accountNum];
    }

    public String toString() {
        String out = "";
    
        out += getName();
        out += " with balance " + totalBalance;

        return out;
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
