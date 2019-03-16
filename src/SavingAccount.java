import java.util.Scanner;

//Be careful with naming convention.
public class SavingAccount {
    private double savingBalance; // good use of naming convention.

    //I am sure you were confused about what access modifier to use. Here is what I am thinking,
    // use a private access to the variable and create public static setter method to set it's value
    // and we may add some validation there in the future. but avoid using package access (no access modified) because
    // it's accessible only in the same folder (it's not a good practice).

    private static double annualInterestRate; // naming convention.

    public SavingAccount(double savingBalance) {
        if (savingBalance == 0) {
            this.savingBalance = 100;
        } else {
            this.savingBalance = savingBalance;
        }
        System.out.println("Hello to my saving account ");
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    /**
     * This method should be public static, because it doesn't belong to certain object (static variable is shared).
     */
    public static void setAnnualInterestRate(double annualInterestRate) {
        // we shouldn't use "this" because this belongs to the current object, but static variables don't belong to
        // any objects (they are shared).
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double getAnnaualInterestrate() {
        return annualInterestRate;
    }

    public void changeAnnualInterestRate(double annualInterestRate) {
        setAnnualInterestRate(annualInterestRate); // good practice. Thanks!
    }

    // When method has a public access, it's meant to be for users that uses the class.
    // For this purpose, method name should represent what it does, meaning this method
    // calculates monthly interest, so it should have named calculateMonthlyInterest()
    // Or calcMonthlyInterest() for short.
    public void calcMonthlyInterest() {
        double monthlyInterest = (savingBalance * annualInterestRate) / 12;
        this.savingBalance += monthlyInterest;
    }

    public static void main(String[] args) {
        /**
         * From my code observation, I noticed that you didn't get the idea of static. Ok that's fine, lets talk about it:
         * static variable means a shared value between all objects of the same class, meaning when you set annualInterestRate
         * to 0.04 for example in one object, this value becomes shared between the two objects, therefore to make this code
         * behaves in the right manner. we will remove the set parameter of annualInterestRate from constructor and we
         * will create a static setter method for this purpose.
         *
         * Thanks!
         */
        Scanner input=new Scanner(System.in);
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        SavingAccount.setAnnualInterestRate(0.04);
        System.out.println("we sum the monthly interest with saving balance");
        
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();
        System.out.println("savingBalance saver1= " + saver1.getSavingBalance());
        System.out.println("savingBalance saver2= " + saver2.getSavingBalance());
        System.out.println("Please enter your new value of annualInterestRate that will be 0.05");
        SavingAccount.setAnnualInterestRate(input.nextDouble()); // In this way we set a value to the static variable

        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();
        System.out.println("The new values of balance for both saver1&saver2 without changing the first values to both balances");
        System.out.println("savingBalance saver1= " + saver1.getSavingBalance());
        System.out.println(" savingBalance saver2= " + saver2.getSavingBalance());

    }

}
