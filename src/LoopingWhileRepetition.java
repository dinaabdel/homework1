
// Naming Convention: For class name, all words starts with Capital letter.
public class LoopingWhileRepetition {
    private int num;

    public LoopingWhileRepetition() {
        num = 8;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        /**
         * Great job, I don't want to talk much here because the aim of this task is to remember how to use loops.
         * But I have one note, for future purposes you could make general method to do the same purpose, as an example,
         * I refactored the for loop to have one method but as I said it's up to you, you are the designer.
         *
         * You did a great job until here, keep going.
         *
         * Muhammad Ayesh
         */
        System.out.println("the for loop before modify");
        printShapeUsingForLoop(1,"8");
        System.out.println("the for loop after modify");
        printShapeUsingForLoop(2,"8");

        System.out.println("the while loop before modify");
        int p = 0;
        while (p <= 11) {
            int l = 0;
            while ((l <= p)) {
                System.out.print("8");
                l += 1;
            }
            System.out.println("");
            p += 1;
        }

        System.out.println("the while loop after modify");
        int i = 0;
        while (i <= 11) {
            int j = 0;
            while ((j <= i)) {
                System.out.print("8");
                j += 1;
            }
            System.out.println("");
            i += 2;
        }
    }

    private static void printShapeUsingForLoop(int outerStep, String shape) {
        for (int i = 0; i <= 11; i += outerStep) {
            for (int j = 0; j <= i; j++) {
                System.out.print(shape);
            }
            System.out.println(" ");
        }
    }


}

