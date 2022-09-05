import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
       
        ArrayList<String> res = getMazePaths(0, 0, n-1, m-1);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       if(sr>dr || sc > dc){// invalid place base case
        ArrayList<String> base = new ArrayList<>();
        return base;
       }
       if(sr == dr && sc == dc){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
       }
       // horizontal move
       ArrayList<String> hpath= getMazePaths(sr, sc+1, dr, dc);
       // vertical move
       ArrayList<String> vpath= getMazePaths(sr+1, sc, dr, dc);
       ArrayList<String> path = new ArrayList<>();
       for(String p: hpath){
        path.add("h"+p);
       }
       for(String p: vpath){
        path.add("v"+p);
       }

        return path;
    }

}