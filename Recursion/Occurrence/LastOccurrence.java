class LastOccurrence{
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,4,3,2,1,2,4,3,2,2,1};
        System.out.println(lastOccurrence(arr,2,0));
    }
    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOccurrence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
}