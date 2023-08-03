public class UseLoan {

    public static void main(String[] args) {

        Loan jims = new Loan("James Gosling", 200);

        // Do this with the toString method commented out in Loan.java
        // and see what you get
        // Case 1.

            //    System.out.println(jims);


        // Do this again with the toString method added in Loan.java
        // and see what you get
        // Case 2.
            //    System.out.println(jims);

        // In both cases 1 and 2, they are a shorthand version of this:
        //
            //    System.out.println(jims.toString());

        // In summary, try this twice: once with toString commented
        // out and once more with toString added in.
        // Case 3.

        // System.out.println("Loan information: " + jims);
        // System.out.println("Loan information: " + jims.toString());

    }

}

/*

If you do not add toString in a class, there is a default definition
added by the Java language.  The default definition of toString
returns the location of the object in memory in a string form.  It
looks something like Loan@18d107F which is really a hexadecimal (base-16)
representation of the memory address.  That is, it says that the object
is a Loan object located in that memory address.  It is really not a very
useful piece of information, but that is the best that the Java language
could do.  In fact, the system does this for ALL objects in Java, not
just Loan objects.

We can make it more meaningful than that.  We do that by redefining
(i.e., overwriting) the system's default definition with the extra
information that we have on a particular class that we are designing.
So, in the case of the Loan class, we might want to print the name of
the loan owner as well as the current balance if we think that is what
we would want to see when we print a loan object.  If we don't want to
reveal the balance, but only the name, we can define it that way - your
call.  Whatever we write in the body of the toString method is what we
will get.


Note that there is always a toString defined in any class.  In fact, we
have been using that hidden defintion of toString in all of the classes
that we have been using since the beginning of the semester.  The toString
method on an object will be called automatically whenever and wherever
a string representation of the object is needed based on the context that
the object reference is used.  So, take a look at this:

      Loan myloan = new Loan("Jim Jones", 2000);
      System.out.println(myloan);

Given that myloan is an object reference for a Loan object, we need a
string representation of myloan.  Why do we need a string representation?
Well, it is because the println function expects a string as its argument.
If we do not add any new definition for toString in Loan, then the system
will call the default definition of toString on myloan as if you called
it explicitly like this myloan.toString() and print the result of the
toString call to the console.  If you redefined toString in Loan, then it
would print whatever that new definition of toString returns.  In our
example, what gets printed would look like this: "Jim Jones, 2000" because
that is what the toString method in Loan.java returns.

If we printed it with this call:

      System.out.println("Loan information: " + myloan);

then you can see what would be printed to the console.

Remember that I said Java introduces the method toString to all objects in
Java?  Let us see where that is done.  There is a class named Object (note
the uppercase O) which has some methods defined in it.  This Object class
is then "inherited" automatically by any and all Java classes that we define.
Go check the documentation on Object on the Java documentation site.  It
will show toString as one of the 11 methods defined in that class.
'equals' is another one that we will discuss shortly.  Out of the 11
there, we will only discuss two: 'toString' and 'equals' in this course
this semester.  If you continue on to CSE 214, you will end up seeing most
of them, which means that you get to see most of Java - well almost.

 */
