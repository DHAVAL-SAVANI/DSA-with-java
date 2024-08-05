public class QuickSort {
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pindex = partation(arr, si, ei); // for two partation of array by pivot element
        quickSort(arr, si, pindex-1); // for left part
        quickSort(arr, pindex+1, ei); // for right part
    }
    public static int partation(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
         i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
