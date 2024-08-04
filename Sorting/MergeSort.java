class MergeSort{
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2; // calculate mid index
        mergeSort(arr, si, mid); // for left part of array
        mergeSort(arr, mid+1, ei); // for right part of array
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part of arr
        int j = mid+1; // iterator for right part of arr
        int k = 0; // iterator for temp
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++]; 
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
}