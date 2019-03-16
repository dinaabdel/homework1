import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 8;
        year = 2000;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public void printDate2() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date d1 = new Date();
        System.out.println("Enter the Date of this day please");
        int day = input.nextInt();
        d1.setDay(day);
        int month = input.nextInt();
        d1.setMonth(month);
        int year = input.nextInt();
        d1.setYear(year);
        System.out.println(" will be print the Date that you write it");
        d1.printDate();

        // Good, but it doesn't make sense. But Thanks, I am sure you
        // got the idea of methods reusability.
        System.out.println("by using getter function");
        d1.printDate2();

        // You did a good job here, please read the previous notes in the past two tasks.
    }
}
