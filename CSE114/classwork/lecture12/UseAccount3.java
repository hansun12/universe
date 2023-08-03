public class UseAccount3 {

    public static void main(String[] args) {

        Customer jim = new Customer("Jim Jones", 520, "333 Mills", 800);
        Account3 jims = new Account3(1000, 46, jim);

        System.out.println("Jim's balance is: " + jims.getBalance());
        jims.deposit(20);
        System.out.println("Jim's balance is: " + jims.getBalance());
        jims.withdraw(30);
        System.out.println("Jim's balance is: " + jims.getBalance());
        jims.withdraw(3000);
        System.out.println("Jim's balance is: " + jims.getBalance());
        System.out.println("Account owner is: " + jims.getOwner().getName());

        System.out.println();

        // We can create a customer object and use it directly in place
        // without giving an explicit local variable name to it since
        // it will only be used once.
        Account3 amys = new Account3(2000,
                47,
                new Customer("Amy Smith",
                        528,
                        "127 Oaks",
                        820));
        System.out.println("Amy's balance is: " + amys.getBalance());
        amys.deposit(200);
        System.out.println("Amy's balance is: " + amys.getBalance());
        amys.withdraw(300);
        System.out.println("Amy's balance is: " + amys.getBalance());
        amys.withdraw(30000);
        System.out.println("Amy's balance is: " + amys.getBalance());
        System.out.println("Account owner is: " + amys.getOwner().getName());

        // You can create as many Account3 objects as you like...
    }

}

/*
 * Note how an object, e.g., jim as a Customer object, is created first
 * and it is used to be included in another object, e.g., jims of Account3
 * type.  You will use this way of creating objects as you deal with
 * programs of some complexity all the time. So, make a note of it here!!!
 */
