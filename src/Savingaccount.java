import java.util.Scanner;

public class Savingaccount {
    private double savingBalance;
    static double annaualInterestrate;

    public Savingaccount( double annualinterestrate){
        if (savingBalance==0){
        savingBalance=100;}
        this.annaualInterestrate=annualinterestrate;
        System.out.println("Hello to my saving account ");
    }
    public void setSavingBalance(double savingBalance){
        this.savingBalance=savingBalance;
    }
    public void setAnnaualIntrestrate(double annaualInterestrate){
        this.annaualInterestrate=annaualInterestrate;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double getAnnaualInterestrate(){
        return annaualInterestrate;
    }

    public void changeannualInterestrate(double annaualInterestrate){
        setAnnaualIntrestrate(annaualInterestrate);

    }
    public void monthlyinterest(){
        double monthlyinterest=(savingBalance*annaualInterestrate)/12;
        this.savingBalance+=monthlyinterest;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Savingaccount saver1=new Savingaccount(0.4);
        Savingaccount saver2=new Savingaccount(0.4);
        saver1.setSavingBalance(2000);
        saver2.setSavingBalance(3000);
        System.out.println("we sum the monthly interest with saving balance");

        saver1.monthlyinterest();
        saver2.monthlyinterest();
        System.out.println("savingbalance saver1= "+saver1.getSavingBalance());
        System.out.println(" savingbalance saver2= "+saver2.getSavingBalance());
        System.out.println("Please enter youer new value of annualinterestrate that will be 0.5");
        double annualInterestrate=input.nextDouble();
        saver1.monthlyinterest();
        saver2.monthlyinterest();
        System.out.println("The new values of balnce for both saver1&saver2 without changing the first values to both balances");
        System.out.println("savingbalance saver1= "+saver1.getSavingBalance());
        System.out.println(" savingbalance saver2= "+saver2.getSavingBalance());

    }

}
