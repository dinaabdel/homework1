import java.util.Scanner;

public class Print {
    private static Object Scanner;
    private int x;
    private int y;
    private  int z;
    private  String r;

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

    public void print(int x){
        System.out.println("this is integer"+x);
    }
    public void printr(String  r){
        System.out.println("this is string "+r);
    }
    public void printxy(int x,int y){
        for(int i=0;i<y;i++){
        System.out.println("x= "+x);
    }}
    public void printxyz(int x,int y,int z){
        for (int i = 0; i <z ; i++){
            int d=0;
            for (d=0;d<=y;d++){
                System.out.print("x="+x);}
               d+=1;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Print myprint=new Print();
        myprint.setX(8);
        myprint.setY(9);
        myprint.setR("dina");
        myprint.setZ(10);
        myprint.print(3);
        myprint.printr("love");
        myprint.printxy(6,7);
        myprint.printxyz(1,2,7);
    }
}
