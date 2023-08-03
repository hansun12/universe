public class Account3 {

    private int balance;
    private int number;
    private Customer owner;  // Object composition here!

    // I will not add the default constructor this time.
    // Use only the one that takes some arguments.
    // Note the type of initialOwner here also - it is Customer!
    public Account3(int initialBalance, int initialNumber, Customer initialOwner) {
        balance = initialBalance;
        number = initialNumber;
        owner = initialOwner;
    }

    // Added only two getter methods and no setters this time here.
    // If you think it would make sense to add more, do it.
    public int getBalance() {
        return balance;
        //        return this.balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public int deposit(int amount) {
        //        this.balance = this.balance + amount;
        //        return this.balance;
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient fund - balance did not change");
            return balance;
        }
        balance = balance - amount;
        return balance;
    }

    // Add other methods as you need them.

}
