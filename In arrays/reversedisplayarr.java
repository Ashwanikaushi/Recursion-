import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        displayArrRev(arr, 0);
    }
// displayArrRev(arr, 0)
    public static void displayArrRev(int arr[], int idx){
        
        if(idx==arr.length) return;
        
        displayArrRev(arr, idx+1);
        System.out.println(arr[idx]);
    }
    // displayArrRev2(arr, arr.length-1)
     public static void displayArrRev2(int arr[], int idx){
        
        if(idx== -1) return;
        System.out.println(arr[idx]);
        displayArrRev2(arr, idx-1);
        
    }
     // displayArrRev3(arr, arr.length-1)
     public static void displayArrRev3(int arr[], int idx){
        
        if(idx== 0){ System.out.println(arr[idx]); return;}
        System.out.println(arr[idx]);
        displayArrRev3(arr, idx-1);
        
    }
     

}