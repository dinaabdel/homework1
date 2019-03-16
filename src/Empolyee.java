import java.util.Scanner;

public class Empolyee {
    private String firstName;
    private String lastName;
    private double salary;

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

    public Empolyee(){
        firstName="Dina";
        lastName="tunsi";
        salary=700;

    }
    public void application () {
        if (salary >= 500) {
            System.out.println("the salary monthly is positive");
        } else
            salary = 0.0;
        System.out.println("the salary is non positive ");
    }
    public double yearlysalary(){
        this.salary*=0.1;
        return salary;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Empolyee e1=new Empolyee();
        Empolyee e2=new Empolyee();
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

        e1.yearlysalary();
        e2.yearlysalary();
        System.out.println("e2.getSalary() = " + e2.getSalary());
        System.out.println("e2.getSalary() = " + e1.getSalary());


    }
}
