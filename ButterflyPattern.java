public class ButterflyPattern {
    public static void main(String[] args) {
        butterfly(5);
    }
    public static void butterfly(int n){
        for(int i=0; i<n*2; i++){
            for(int j=0; j<n*2; j++){
                if(i<n){
                    if(i>=j || (i+j)>=n*2-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if((i+j)<=n*2-1 || (i+j)>=i*2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
