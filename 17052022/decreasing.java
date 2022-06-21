//expectation-faith model in recursion
public class Main {
    public static void printIncreasing(int n){
        if(n==0) return;
        printIncreasing (n-1);//faith
        System.out.println(n);
    }
    public static void main(String[] args){
        printIncreasing(n:5);
    }
}