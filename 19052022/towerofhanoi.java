

public class towerofhanoi {

    public static void main(String[] args)  {
        // write your code here
    }

    public static void toh(int n, int src, int dest, int helper){
        toh(n-1,src,helper,dest);
        System.out.println();
        
    }

}