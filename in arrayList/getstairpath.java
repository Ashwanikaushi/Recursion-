import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);   
        }

    public static ArrayList<String> getStairPaths(int n) {
        if( n== 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myPath = new ArrayList<>();

        // 1 step
        if(n>=1){
            ArrayList<String> myPath1Step = getStairPaths(n-1);
            for(String path: myPath1Step){
                myPath.add("1"+path);
            }

        }
        // 2 steps
        if(n>=2){
            ArrayList<String> myPath2Step = getStairPaths(n-2);
            for(String path: myPath2Step){
                myPath.add("2"+path);
            }
        }
        // 3 steps
        if(n>=3){
            ArrayList<String> myPath3Step = getStairPaths(n-3);
            for(String path: myPath3Step){
                myPath.add("3"+path);
            }
        }
        return myPath;
    }

}