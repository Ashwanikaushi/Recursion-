  public static void main(String[] args) throws Exception {
       System.out.println(factorial(n:5));
    }

    public static int factorial(int n){
        if(n==0) return 1;
        
        return n*factorial(n-1);
    }
