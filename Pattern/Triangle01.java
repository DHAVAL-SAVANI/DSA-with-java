public class Triangle01 {
    public static void main(String[] args) {
        TrianglePattern01(5);
    }
    public static void TrianglePattern01(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
