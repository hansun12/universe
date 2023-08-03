public class UseAccount2 {

    public static void main(String[] args) {

        Account2 amys = new Account2(1000, 46, "Amy Jones");
        System.out.println("Amy's current balance is: " + amys.getBalance());
        amys.deposit(20);
        System.out.println("Amy's current balance is: " + amys.getBalance());
        amys.withdraw(30);
        System.out.println("Amy's current balance is: " + amys.getBalance());
        amys.withdraw(3000);
        System.out.println("Amy's current balance is: " + amys.getBalance());

        System.out.println();

        Account2 kens = new Account2(2000, 47, "Ken Smith");
        System.out.println("Ken's current balance is: " + kens.getBalance());
        kens.deposit(200);
        System.out.println("Ken's current balance is: " + kens.getBalance());
        kens.withdraw(300);
        System.out.println("Ken's current balance is: " + kens.getBalance());
        kens.withdraw(30000);
        System.out.println("Ken's current balance is: " + kens.getBalance());

        // You can create as many Account2 objects as you like...
    }

}
