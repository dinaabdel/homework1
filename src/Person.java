import java.util.Scanner;

public class Person {
    private String name;

    public Person() {
        name = "Dina"; // This is true, but it better to use this to prevent future refactoring mistakes.
        System.out.println("constructor running!");

    }

    public Person(String name) {
        // It's logically wrong to set the name in this way, it's working but from
        // engineering observations it's wrong. And the reason that the object has not instantiated yet.
        // You may find many tutorials on the Internet that calls methods from the Constructor, but it's wrong.
        // Thank you!
        setName(name);
        this.name = name; // this is the better way
        System.out.println("name = " + name);
    }

    // To prevent methods names misleading,
    // we should follow naming convention, as java and all developers follow them.
    public String getName() {
        return name;
    }

    // Good following for the naming convention.
    public void setName(String name) {
        this.name = name;
    }

    // we have to follow naming convention here too.
    public void writeName(String name) {
        setName(name);// good practice to call another method to set the name. Thanks!
        System.out.println("name = " + name);
    }

    // Just to make sure, we usually don't put main method in the same class.
    // But it's ok for learning purposes.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person newPerson = new Person(); // naming convention for local variables
        System.out.println("we put the name sara to non default constructor to object newPerson1");
        Person newPerson1 = new Person("sara");// naming convention for local variables

        System.out.println("we use the object newPerson to examine all process that use default constructor ");
        System.out.println(newPerson.getName());
        System.out.println("Pleas enter your name");

        String name = input.next();
        newPerson.setName(name);
        newPerson.getName();
        System.out.println("Your name was printing ");
        newPerson.writeName(name);

        /**
         * Thanks So Much!
         * Your are very fast learner and you got the idea about objects and accessors and methods.
         * You did better than me when I started learning.
         * You will be a great programmer in the future.
         * Thanks again!
         * Muhammad Ayesh.
         */
    }

}
