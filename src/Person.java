import java.util.Scanner;

public class Person {
    private String name;

    public Person(){
        name="Dina";
        System.out.println("constructor running!");

    }
    public Person (String name){
        setName(name);
        System.out.println("name = " + name);
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void writename(String name){
        setName(name);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person newperson = new Person();
        System.out.println("we put the name sara to non default constructor to object newperson1");
        Person newperson1 = new Person("sara");
        System.out.println("we use the object newperson to examine all process that use default constructor ");
        System.out.println(newperson.getname());
        System.out.println("Pleas enter your name");
        String name = input.next();
        newperson.setName(name);
        newperson.getname();
        System.out.println("Your name was printing ");
        newperson.writename(name);
    }

}
