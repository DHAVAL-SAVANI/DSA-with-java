public class ArrayPairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        pairOfArray(arr);
    }
    public static void pairOfArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.err.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
}
