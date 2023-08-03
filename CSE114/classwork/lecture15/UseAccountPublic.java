/* Now that the fields in Account are declared to be public,
 * we can access them directly without having to go through a getter
 * or a setter.  For example, we can do:
 *     johns.balance
 * instead of doing:
 *     johns.getBalance()
 * It seems more convenient, but not a good way to write your software
 * if you care about the maintainability of the software that you write.
 */
public class UseAccountPublic {

    public static void main (String[] args) {

        AccountPublic johns = new AccountPublic("John Doe", 10);
        AccountPublic marys = new AccountPublic("Mary Jones", 100);

        // Here AccountPublic.getSumBalance() since getSumBalance is static.
        System.out.println("Sum Balance: " + AccountPublic.sumBalance);

        // Here johns.getBalance() since getBalance is dynamic
        System.out.println("John: " + johns.balance);

        johns.deposit(20);
        johns.withdraw(10);
        System.out.println("John: " + johns.balance);

        System.out.println();
        System.out.println("Sum Balance: " + AccountPublic.sumBalance);

        System.out.println();
        System.out.println("Mary: " + marys.balance);
        marys.deposit(20);
        marys.withdraw(10);
        System.out.println("Mary: " + marys.balance);

        System.out.println();
        // Any of these would work, . . .
        // That is, static members can be accessed with dynamic objects.
        System.out.println("Sum Balance: " + AccountPublic.sumBalance);
        System.out.println("Sum Balance: " + johns.sumBalance);
        System.out.println("Sum Balance: " + marys.sumBalance);

        // But this would not work, right?
        // System.out.println("Mary: " + AccountPublic.balance);

        // These of course will work
        System.out.println();
        System.out.println("Name: " + marys.name);
        System.out.println("Balance: " + marys.balance);
        System.out.println("Id: " + marys.id);
    }

}
