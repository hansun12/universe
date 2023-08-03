/**
 * This class (Account) models bank accounts
 */
public class Account {

    // balance here is called a field
    private int balance;

    // A constructor with one parameter
    // Note that there is no return type specification with a constructor.
    // Also note that the name of the constructor is the same as the
    // name of the class.  A constructor looks much like a method, but
    // there are these differences mentioned above.
    //
    // Constructors are executed when 'new' is called with the class name
    // as in
    //          new Account()
    //          new Account(200)
    //
    public Account() {
        balance = 0;
    }

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }
   
}
