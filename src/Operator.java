import java.util.Scanner;

public class Operator {


    public static void main(String[] args) {
        /**
         * Great Job, now you remember the basics very well.
         *
         * My notes here:
         * You should use methods instead.
         * The program has to be infinite until the user enters 'Z', I am sure that you know how to do it, but you maybe
         * forgot. But in case that you don't know how, this can be happen in multiple ways, one of them by
         * infinite loop while(true) and check for the value of the string ('z or Z' value) before any operation, then
         * using "break;" to exit the loop.
         *
         * Thanks!
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter any two integer value");
        int number = input.nextInt();
        int number2 = input.nextInt();
        String operator = input.next();
        int resul = 0;
        if (operator.equals("*")) {
            resul = number * number2;
        } else if (operator.equals("/")) {
            resul = number / number2;
        } else if (operator.equals("+")) {
            resul = number + number2;
        } else if (operator.equals("-")) {
            resul = number - number2;
        } else if (operator.equals("%")) {
            resul = number % number2;
        }

        System.out.println("NUMBER = " + number + "number2= " + number2 + "operator=" + operator + " " + "result= " + resul);
        System.out.println("NOW IS THE SAME WORK USE SWITCH ");
        Scanner out = new Scanner(System.in);
        System.out.println("enter the number of your operation so,1 =*,2=/,3=+,4-,5=%");
        int numOfop = out.nextInt();
        int num = out.nextInt();
        int num1 = out.nextInt();
        String operator2;
        int result = 0;
        System.out.println("the range og variable numOfop between 1 to 5 so please enter this range ");
        switch (numOfop) {
            case 1: {
                System.out.println("the multiple operation");
                result = num * num1;
                break;
            }
            case 2: {
                System.out.println("the divide operation ");
                result = num / num1;
                break;
            }
            case 3: {
                System.out.println("the sum operation");
                result = num + num1;
                break;
            }
            case 4: {
                System.out.println("the subtraction operation");
                result = num - num1;
                break;
            }
            case 5: {
                System.out.println("the moduls operation");
                result = num % num1;
                break;
            }

        }
        System.out.println("num=" + num + "num1=" + num1 + "result=" + " " + result);
    }
}
