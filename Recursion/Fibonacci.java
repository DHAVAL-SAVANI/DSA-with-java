class Fibonacci{
    public static void main(String[] args) {
        System.out.println(nthFibonacci(6));
    }
    public static int nthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}