public class UseAccount {

    public static void main (String[] args) {

        Account johns = new Account("John Doe", 10);  // Line 1
        Account marys = new Account("Mary Jones", 100);

        // See what toString does
        System.out.println(johns);
        System.out.println(marys);

        // Here Account.getSumBalance() since getSumBalance is static.
        System.out.println("Sum Balance: " + Account.getSumBalance()); // Line 2

        // Here johns.getBalance() since getBalance is dynamic
        System.out.println("John: " + johns.getBalance());

        johns.deposit(20);
        johns.withdraw(10);
        System.out.println("John: " + johns.getBalance());

        System.out.println();
        System.out.println("Sum Balance: " + Account.getSumBalance());

        System.out.println();
        System.out.println("Mary: " + marys.getBalance());
        marys.deposit(20);
        marys.withdraw(10);
        System.out.println("Mary: " + marys.getBalance());

        System.out.println();
        // Any of these would work, . . .
        // That is, static members can be accessed with dynamic objects.
        System.out.println("Sum Balance: " + Account.getSumBalance());
        System.out.println("Sum Balance: " + johns.getSumBalance());
        System.out.println("Sum Balance: " + marys.getSumBalance());

        // But this would not work, right?
        // System.out.println("Mary?: " + Account.getBalance());

        // These of course will work
        System.out.println("Name: " + johns.getName());
        System.out.println("Id: " + marys.getId());
    }

}

/* The first occurrence of Account in Line 1 is a type named Account.
 * The second occurrence of Account in Line 1 is a constructor named Account.
 * Account in Line 2 is a static object named Account (a meta-object)
 */
