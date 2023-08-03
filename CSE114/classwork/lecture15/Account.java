/*
 * This class uses both static members (fields and methods) and
 * dynamic members (fields and methods).
 * See how static and non-static members are used in UseAccount.java.
 * Also see how static fields are shared by all the non-static methods.
 *
 */
public class Account {

    /* 1. Static fields
     *    They may be public or private, but use private.
     */
    private static double sumBalance = 0;  // sum of all balances
    private static int idgenerator = -1;

    /* 2. Any number of static functions/methods.
     *    They may be public or private.
     */
    public static double getSumBalance () {
        return sumBalance;
    }

    private static int getNewId () {
        idgenerator = idgenerator + 1;
        return idgenerator;
    }

    // 3. Any number of dynamic (non-static) fields
    //    They may be public or private, but use private.

    private String name;
    private double balance;
    private int id;

    // 4. Any number of constructors
    //    They are public.
    public Account (String n, double initb) {
        name = n;
        balance = initb;
        id = getNewId();
        sumBalance = sumBalance + initb;
    }

    /* 5. Any number of dynamic methods including getters and setters
     *    They may be public or private
     */
    
    public String getName () {
        return name;
    }

    public void setName (String n) {
        name = n;
    }

    public double getBalance () {
        return balance;
    }
    // Note that setBalance is not needed because there is no need for it.
    
    public double deposit (double amount) {
        balance = balance + amount;
        sumBalance = sumBalance + amount;
        return balance;
    }

    public double withdraw (double amount) {
        if (amount > balance) {
            System.out.println("Insufficient fund - balance unchanged");
            return balance;
        }
        balance = balance - amount;
        sumBalance = sumBalance - amount;
        return balance;
    }

    public int getId () {
        return id;
    }

    public String toString () {
        return
            "(" +
            name + ", " +
            id + ", " +    // Do I really want to include id as well here?
            balance + ")";
            
    }

    // Yes, of course you may want to define equals as well here. . .
    // And any other that you find useful. . .
    
}
