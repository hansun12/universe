public class Account2 {

    private int balance;
    private int number;
    private String owner;

    // I will not add the default constructor this time.
    // Use only the one that takes three arguments.
    public Account2(int initialBalance, int initialNumber, String initialOwner) {
        balance = initialBalance;
        number = initialNumber;
        owner = initialOwner;
    }

    // Added only one getter method and no setters this time here.
    // If you think it would make sense to add more, do it.
    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
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

}
