// This is shown only because it will help you understand the
// Tic Tac Toe program that you may have to deal with later.
// 
// In general I strongly discourage you from using these static
// (non-local) variables.  Using them is considered a bad
// programming practice.  Later, I will show you some situations
// where staic variables are good to use.  Until then let's use
// them in cases in which I suggest that you use them.

// This program shows how static variables are used to remember
// some state information (balance in this case).
// Think about what happens with local variables (amount in this
// program) as you call a method and return from it.  Static
// variables do not go away even after you return from a method,
// thus called static as opposed to non-static, i.e., dynamic.  
// Local variables are called dynamic (or automatic).  Automatic
// because they are created automatically when a function is called
// and disappear automatically when the function exits/returns.

// As you can see in this example, the value of balance is shared
// by all the fuctions defined in the class.  For example, deposit
// and withdraw both update the value of the static field named
// balance.  The value of balance is available in any of the the
// functions in the class.  Yes, it may be convenient if you don't
// like to pass values around between functions.  That is
// the advantage.  The disadvantages include: it is hard to read
// the program once the program gets bigger and more complex.
// With these non-local variables (static fields are non-local
// variables from the functions' point of view), it is often hard
// to tell which function is changing what at what point in time,
// which makes it hard to read and understand the program.  More on
// this later as we discuss static variables more later.  For now,
// try to avoid using them unless you must.  In Tic Tac Toe, we will
// use them and try to improve it by rewriting it with something
// better to use instead.

public class StaticFields {

    private static int balance = 0;   // You may ignore what private means
                                      // for now just like we have been
                                      // ignoring public all this time.
                                      // It's simply a necessary decoration
                                      // for us for now.

    public static void deposit (int amount) {
        balance = balance + amount;
    }

    public static void withdraw (int amount) {
        balance = balance - amount;
    }

    public static void main (String[] args) {

        System.out.println(balance);

        deposit(100);

        System.out.println(balance);

        withdraw(20);

        System.out.println(balance);
    }

}
