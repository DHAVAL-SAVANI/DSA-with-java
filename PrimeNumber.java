public class prime{
    public static void main(String args[]){
        int n=100;
        boolean isprime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isprime = false;
                break; 
            }
        }
        if(isprime){
            System.out.println("Number is Prime.");
        }
        else{
            System.out.println("Number is Not Prime.");
        }
    
        System.out.println(isprime(n));
        
        primeInRange(n);
    }
    public static boolean isprime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }
}