//good naming convention
public class Print {
//    private static Object Scanner;
    private int x;
    private int y;
    private int z;
    private String r;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print(int x) {
        System.out.println("this is integer" + x);
    }

    public void print(String r) {
        System.out.println("this is string " + r);
    }

    public void print(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.println("x= " + x);
        }
    }

    public void print(int x, int y, int z) {
        for (int i = 0; i < z; i++) {
//            int d = 0;
            for (int d = 0; d < y; d++) {
                System.out.print(x);
            }
//            d += 1;
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        /**
         * From my observation, I think you may didn't understand the task very well or you didn't understand method
         * over loading and this is good, if we didn't make mistakes, we will never learn anything new.
         *
         * Method overloading: The method can have the same name but we have to follow the following rules:
         * 1- Number of the parameters should be different Or
         * 2- Type of the parameters should be different Or
         * 3- Order of the parameters should be different.
         *
         * One other thing, it's not necessary for every class to have setters and getters, use them
         * when you may need them.
         *
         * Thanks!
         */
//        Scanner input = new Scanner(System.in);
        Print myPrint = new Print();
        myPrint.setX(8);
        myPrint.setY(9);
        myPrint.setR("dina");
        myPrint.setZ(10);

        myPrint.print(3);
        myPrint.print("love");
        myPrint.print(6, 7);
        myPrint.print(1, 2, 7);
    }
}
