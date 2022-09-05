import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonicci(n));
    }

    public static int fibonicci(int n){
        
        if(n==0 || n==1) return n;
        return fibonicci(n-1)+fibonicci(n-2);
        
    }

}