public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {3,6,3,7,8,5,7,3,2,8};
        System.out.println(firstOccurrence(arr, 7, 0));
    }
    public static int firstOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }
}
