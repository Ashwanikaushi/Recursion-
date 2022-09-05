import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(0,0,n-1, m-1);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
      if(sr> dr || sc> dc){
          ArrayList<String> base = new ArrayList<>();
          return base;
      }  
      if(sr==dr && sc == dc){
          ArrayList<String> base = new ArrayList<>();
          base.add("");
          return base;
      }
      // horizontal move 
    //   ArrayList<String> hpath = getMazePaths(sr, sc+1, dr, dc);
      // vertical move
      
      // diagonal move
     
      ArrayList<String> path = new ArrayList<>();
      for(int i=1; i<= dc - sc; i++){
          ArrayList<String> hpath = getMazePaths(sr, sc+i, dr, dc);
      for (String p : hpath) {
        
          path.add("h"+i+p);
          
      }
      }
      for(int i=1; i<= dr-sr; i++){
          ArrayList<String> vpath = getMazePaths(sr+i, sc, dr, dc);
      for(String p : vpath){
          path.add("v"+i+p);
      }
      }
      for(int i =1; i<=dr-sr && i<= dc-sc; i++){
           ArrayList<String> dpath = getMazePaths(sr+i, sc+i, dr, dc);
      for(String p: dpath){
          path.add("d"+i+p);
      }
      }
      return path;
    }

}