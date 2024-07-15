public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,6,7,8,9,20};
        int index = binarySearch(arr, 3);
        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key is at index : "+index);
        }
    }
}
