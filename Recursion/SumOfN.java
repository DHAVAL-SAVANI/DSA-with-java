public class SumOfN {
    public static void main(String args[]){
        int n = 5;
        System.out.println("Sum of " + n + " natural number = " + sumOfN(n));
    }
    public static int sumOfN(int n){
        if(n==1){
            return n;
        }
        return n + sumOfN(n-1);
    }
}
