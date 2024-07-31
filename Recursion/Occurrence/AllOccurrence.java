public class AllOccurrence {
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,36,7,73,2,5,5,6,7,2,0};
        allOccurrence(arr, 2, 0);
    }
    public static void allOccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurrence(arr,key,i+1);
    }
}
