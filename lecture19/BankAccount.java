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

    public BankAccount(int accountNum, String type, String name) {
        this.balance = 0;
        this.accountNum = accountNum;
        this.type = type;
        this.name = name;
        frozen = false;

        if (type.equals("checking")) {
            interest = .001;
        } else if (type.equals("savings")) {
            interest = .04;
        } else if (type.equals("student")) {
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(String t) {
        type = t;
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        //deposit
        System.out.println("Your new balance is: " + balance);
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

    public String getStatement() {
        String statement = "Hello " + name + "\n";
        statement += "Balance: " + balance;
        statement += "for account number " + accountNum + "\n";

        if (frozen) {
            statement += "\n your account is frozen!\n";
        }

        return statement;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "savings", "Elizabeth");

        System.out.println(account);


        account.deposit(100);
        account.withdraw(10);
        //System.out.println(account);
        String statement = account.getStatement();
        System.out.println(statement);

        //deposit
        //withdraw
        //getStatement
    }

}
