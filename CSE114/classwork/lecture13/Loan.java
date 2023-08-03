/*
 * This example illustrates how toString is used in an object
 *
 * Printing objects
 *
 *  . see toString and also see how it is used in UseLoan.java
 *
 *  . I have added a detailed description on toString in UseLoan.java.
 *    Be sure you read it.
 */

public class Loan {

    private int balance;
    private String name;

    public Loan(String n, int initBalance) {
        name = n;
        balance = initBalance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // setters are omitted for simplicity in this example.


    // Uncomment this method at the appropriate time as you
    // test UseLoan.java.
    //
    
    public String toString () {
        return "(" + name + ", " + balance + ")";
    }
    
}
