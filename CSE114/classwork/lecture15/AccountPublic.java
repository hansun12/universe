/*
 * This class is much like Account.java except I am using public
 * everywhere I used private in Account.java.
 *
 * I am NOT advocating that you use public like I do here.  In fact, you
 * should NOT use public unless it is ABSOLUTELY necessary to do so, which
 * is veeeeery rarely the case, if at all.  It will make your programming
 * simpler, but it is a bad software engineering practice.
 *
 * I am showing you this way of writing a similar program only to show
 * you that it is possible as well as to demonstrate the concept of
 * visibility control with the private and public keywords.
 *
 * Use this file along with UseAccountPublic.java and see the differences
 * between these two files and the previous version of these files, i.e.,
 * Account.java and UseAccount.java.
 *
 * By using public as I did here, you are exposing the internals of the
 * class and it will be hard to change the internals later once some use
 * code have been written based on the original that has been publicized
 * for a while.  For example, suppose you want to change the name id to
 * identifier for whatever reason after some use code have been written
 * with id.  You would have to make the same changes in all the use code.
 * If you used private and provided getId(), then, the use code wouldn't
 * have to be modified when you change id to identifier.
 */

public class AccountPublic {

    public static double sumBalance = 0;  // sum of all balances

    // Making this one public is particularly bad since this static field
    // is not meant to be accessed outside this class.  I will still
    // leave this one public although a bad idea.
    public static int idgenerator = -1;
             
    // Another one that really have to be private, but. . .
    public static int getNewId () {
        idgenerator = idgenerator + 1;
        return idgenerator;
    }

    public String name;
    public double balance;
    public int id;

    public AccountPublic (String n, double initb) {
        name = n;
        balance = initb;
        id = getNewId();
        sumBalance = sumBalance + initb;
    }

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

    public String toString () {
        return
            "(" +
            name + ", " +
            id + ", " +
            balance + ")";
            
    }

    // Yes, of course you may want to define equals as well here. . .
    // And any other that you find useful. . .
    
}
