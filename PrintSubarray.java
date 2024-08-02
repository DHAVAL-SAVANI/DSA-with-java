public class PrintSubarray {
    static public void main(String args[]){
        // System.out.println(args[1]);
        // System.out.println(args[0]);
        int arr[]={1,2,3,4,5},n=5;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("(");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]); 
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
