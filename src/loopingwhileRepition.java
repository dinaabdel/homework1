public class loopingwhileRepition {
    private int num;
    public loopingwhileRepition(){
        num=8;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
          System.out.println("the for loop before modify");
        for (int i = 0; i <=11 ; i++) {
          for (int j = 0; j <=i ; j++) {
            System.out.print("8");
    }
        System.out.println(" ");
        }
        System.out.println("the for loop after modify");
       for(int y=0;y<=11;y+=2){

            for(int r=0;r<=y;r++){
                System.out.print("8");

            }
            System.out.println(" ");
        }
        System.out.println("the while loop before modify");
        int p=0;
        while(p<=11) {
            int l=0;
            while ((l<=p))
            {
                System.out.print("8");
                l+=1;
            }
            System.out.println("");
            p+=1;
        }


        System.out.println("the while loop after modify");
        int i=0;
        while(i<=11) {
            int j=0;
            while ((j<=i)){
                System.out.print("8");
                j+=1;
            }
            System.out.println("");
            i+=2;
        }}


}

