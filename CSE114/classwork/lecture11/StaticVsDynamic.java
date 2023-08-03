public class StaticVsDynamic {

    /*  You will see something like this if you see the
        definition of nextInt in the class java.util.Random.
        Note that there is no 'static' keyword in the definition.
        That is, it is not a static method, but a non-static (aka
        dynamic) method.  Non-static methods are called differently
        as you can see in the main below.  We are now getting ready
        to talk about dynamic methods, which
        means that we are talking about objects now.

    public int nextInt(int limit) {
        // whatever it does to create a random number
    }

    */

    public static void main (String[] args) {
      java.util.Random r = new java.util.Random();
      int i = r.nextInt(10);                             // Line 1
      // WRONG        int i = Random.nextInt(10);
      System.out.println("A random number is: " + i);

      int size = 10;
      int range = 100;
      int[] ints = ArrayTools.randomArray(size, range); // Line 2

      ArrayTools.printArray(ints, "An array of 10 random numbers:");

    }
  }

/*
 We have been using the dot ('.') operator in different situations.  It
 may seem a lot of different situations, but it comes down to two
 cases as examplifed in Line 1 and Line 2 above.

 Line 1:   r.nextInt(10);

   Here, r is an object of type java.util.Random.  In that object a
   method named nextInt(...) is defined.  We are calling that method
   by using the dot ('.') operator.

 Line 2:   ArrayTools.randomArray(size, range);

   Here, ArrayTools is an object.  In that object a method named
   randomArray(...) is defined.  We are calling that method by using
   the dot ('.') operator.

 That much is common.  So, what is different about these two situations?
 In one (Line 1), we are using r, a dynamic object of type Random, (not
 the class name Random) before the dot ('.') operator.

 In the other (Line 2), we are using ArrayTools, a static object
 ArrayTools which happens to have the same name as the class name itself
 (that is how it is done in Java), before the dot ('.') operator.

 If the method that we are calling is a static method (the one that has
 the 'static' keyword in the header line of the method definition), then
 we use the class name followed by the dot ('.') operator followed by
 the method name and the necessary arguments.

 If the method that we are calling is a non-static (aka dynamic) method
 (the one that does not have the 'static' keyword in the header line of
 the method definition), then we use the object variable (not the class
 name) followed by the dot ('.') operator followed by the method name and
 the necessary arguments.  We have not defined classes of this kind yet.
 We will do so when we talk about objects, very soon. nextInt in
 java.util.Random is defined that way as I showed at the top of this file.

 We call r a dynamic (non-static) object, whereas ArrayTools a static
 object.  Wait a minute!  Is ArrayTools an object, furthermore a static
 object?  Is it a class name?  Yes and Yes.  When you create a class,
 the Java language system creates a static object with a name same as
 the class name.  In that static object all the static methods are
 included and those static mehtods are the ones we call with this
 syntax I have been describing.  Remember the static fields that we
 talked about earlier?  They too are located in this static object.

 When we define our own classes for dynamic objects, I will explain
 this once more.  I think it is enough for now.

 One more thing though: There is only one static object with the same
 name as the class name when you define a class.  However, you may
 have as many dynamic objects as you want because you may create as
 many dynamic objects as you want given a class as you see fit.  For
 example, if you have a class named Student to represent students,
 there will be one static object named Student, whereas you may want
 to create a dynamic object per student that you want to represent.
 So, if you have 1100 students, you would create 1100 student objects
 (student instances) and use each object to include the information
 for each student.

 */
