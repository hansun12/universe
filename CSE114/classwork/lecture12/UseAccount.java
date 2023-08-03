// This class is used to test the definition of Account class.
// As you can see, you can create as many Account objects as you
// wish.  In this example, we create three such account objects,
// one for each of the three customers: John, Amy, and Jim.
//
public class UseAccount {

    public static void main(String[] args) {

        Account johns = new Account();
        System.out.println(johns.getBalance());
        johns.deposit(10);
        System.out.println(johns.getBalance());
        johns.withdraw(5);
        System.out.println(johns.getBalance());

        Account amys = new Account(40);
        System.out.println(amys.getBalance());
        amys.deposit(10000000);
        System.out.println(amys.getBalance());
        amys.withdraw(500);
        System.out.println(amys.getBalance());

        Account jims = new Account(10000);
        System.out.println(jims.getBalance());
        jims.deposit(1000000);
        System.out.println(jims.getBalance());
        jims.withdraw(5000);
        System.out.println(jims.getBalance());
    }
}

/*
  Note the difference in the mechanics of how dynamic objects (johns,
  amys, and jims in this example) are used from the way static objects
  such as ArrayTools and Math are used:

  johns.deposit(...) or amys.withdraw(...)
  vs
  ArrayTools.print(...) or Math.cos(...)

  In the former with a dynamic object, we are using the local variable
  johns (a dynamic object) followed by a dot followed by a dynamic method
  name (deposit).

  In the latter with a static object, we are using the class name itself
  ArrayTools (a static object) followed by a dot followed by a static
  method name (print).

  We had this discussion in our last lecture - see StaticVsDynamic.java.

 */
