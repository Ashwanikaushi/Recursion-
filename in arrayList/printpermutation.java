import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String qsf = scn.nextLine();
        printPermutations(qsf, "");

    }

    public static void printPermutations(String qsf, String asf) {
        if(qsf.length() == 0){
            System.out.println(asf);
            return;
        }
        StringBuilder sb = new StringBuilder(qsf);
        for(int i=0; i<qsf.length(); i++){
            char ch = qsf.charAt(i);
            sb.deleteCharAt(i);
            String roq = sb.toString();
            printPermutations(roq,asf+ch);
            sb.insert(i,ch);
        }
        
    }

}