public class PyramidOfNumber {
    public static void main(String[] args) {
        numberOfPyramid(5);
    }
    public static void numberOfPyramid(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=n*2-1; j++){
                if(i+j<=n){
                    System.out.print("  ");
                }
                else if(k<=i*2-1){
                    if(k==1 || k==i*2-1 || i==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(count+" ");
                        count++;
                    }
                    k++;
                }
            }
            System.out.println();
        }
    }
}
