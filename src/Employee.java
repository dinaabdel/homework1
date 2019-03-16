import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    // It's better to place the constructor after the fields. Because the user of the class
    // usually starts searching about it after the fields. But it's not false to but it anywhere else.
    public Employee(){
        // Usually when you read "constructor that initializes instance variables.",
        // we mean parametrized constructor, but it's ok what you did too. Thanks

        // we should use this keyword such this.firstName
        firstName="Dina";
        lastName="tunsi";
        salary=700;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void application () {
        // usually validations are put in setters. but it depends on the design of the app. Thanks!
        if (salary >= 500) {
            System.out.println("the salary monthly is positive");
        } else
            salary = 0.0;
        System.out.println("the salary is non positive ");
    }

    // Naming Convention
    public double yearlySalary(){
        this.salary*=0.1;
        return salary;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setFirstName("sara");
        e1.setLastName("tunsi");
        e1.setSalary(300);
        e2.setFirstName("maha");
        e2.setLastName("salh");
        e2.setSalary(600);
        System.out.println("e2.getFirstName() = " + e1.getFirstName());
        System.out.println("e2.getLastName() = " + e1.getLastName());
        System.out.println("e2.getSalary() = " + e1.getSalary());

        System.out.println("e2.getFirstName() = " + e2.getFirstName());
        System.out.println("e2.getLastName() = " + e2.getLastName());
        System.out.println("e2.getSalary() = " + e2.getSalary());

        e1.application();
        e2.application();
        System.out.println("e2.getSalary() = " + e1.getSalary());
        System.out.println("e2.getSalary() = " + e2.getSalary());

        e1.yearlySalary();
        e2.yearlySalary();
        System.out.println("e2.getSalary() = " + e2.getSalary());
        System.out.println("e2.getSalary() = " + e1.getSalary());
    }
}
