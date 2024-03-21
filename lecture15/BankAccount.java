//balance, accountNum, interest, type (checking / savings / student), name
//getStatement(), getBalance(), freeze(), withdraw(), deposit()

public class BankAccount {
    double balance;
    int accountNum;
    double interest;
    String type;
    String name;
    boolean frozen;

    public BankAccount() {
        balance = 0;
        accountNum = 12345;
        interest = .0525;
        type = "checking";
        name = "Elizabeth";
        frozen = false;
    }

    public BankAccount(int an, String t, String n) {
        balance = 0;
        accountNum = an;
        type = t;
        name = n;
        frozen = false;

        if (t.equals("checking")) {
            interest = .001;
        } else if (t.equals("savings")) {
            interest = .04;
        } else if (t.equals("student")) {
            interest = .00000001;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public boolean getFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }

    public void withdraw(int amount) {
        if (frozen) {
            System.out.println("Your account is frozen");
            return;
        }

        if (balance < amount) {
            System.out.println("Account balance insufficient");
            return;
        }

        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "savings", "Elizabeth");
    }

}
