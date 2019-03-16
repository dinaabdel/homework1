import java.util.Scanner;

public class Date {
    private int day;
    private  int mounth;
    private  int year;

    public Date(){
        day=1;
        mounth=8;
        year=2000;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMounth(int mounth){
        this.mounth=mounth;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getDay(){
        return  day;
    }
    public int getMounth(){
        return  mounth;
    }
    public int getYear(){
        return  year;
    }
    public void printdate(){
        System.out.println( day+"/"+mounth+"/"+year);
    }
    public void  printdate2(){
        System.out.println(getDay()+"/"+getMounth()+"/"+getYear());
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Date d1= new Date();
        System.out.println("Enter the Date of this day please");
        int day= input.nextInt();
        d1.setDay(day);
        int mounth=input.nextInt();
        d1.setMounth(mounth);
        int year=input.nextInt();
        d1.setYear(year);
        System.out.println(" will be print yhe Date that you write it");
        d1.printdate();
        System.out.println("by using getter function");
        d1.printdate2();
    }
}
