public class DiamondPattern {
    public static void main(String args[]){
        diamond(7);
    }
    public static void diamond(int n){
        for(int i=0; i<n*2; i++){
            for(int j=0; (i<n)?j<n+i:j<n*3-1-i; j++){
                if((i+j)<n-1 || j<i-n){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
