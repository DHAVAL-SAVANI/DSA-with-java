class BruteForce{
    public static void main(String[] args) {
        int arr[] = {-4,2,-1,2,3,7,-3};
        System.out.println(bruteForce(arr));
    }
    public static int bruteForce(int[] arr) {
        int max = Integer.MIN_VALUE; // Here we can use -> (max=a[any_index];)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                max = Math.max(max,currentSum); //------------------------ give maximum value from both
            }
        }
        return max;
    }
}