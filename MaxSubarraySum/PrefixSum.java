public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println(prefixSum(arr));
    }
    public static int prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] += arr[i];
        }
        int ms = Integer.MIN_VALUE; // where ms = max sum
        for(int i=0; i<prefix.length; i++){
            for(int j=0; j<prefix.length; j++){
                if(i>0){
                    int cs = prefix[j] - prefix[i-1];
                    ms = Math.max(ms,cs);
                }
            }
        }
        return ms;
    }
}
