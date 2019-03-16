public class Commandlineinjava {
    public static void main ( String [] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);

        }
        int numofh=0;

        for(int j=0;j<args.length;j++){
            if (args[j]=="h"){
                numofh=+1;
            }
            else{
                System.out.println("the number of h is one");
            }
        }
        System.out.println("numofh="+numofh);
        //System.out.println("hello"+arg[0]);
       // for(String String :arg){
           // System.out.println(String);
       // }//
    }}

