public class Kadanes {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadanes(arr));
    }
    public static int kadanes(int numbers[]){
        int cs=0,ms=Integer.MIN_VALUE; //-------ms=MaxSum , cs=CurrentSum
        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        if(ms==0){
            ms=Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++){
                ms = Math.max(ms,numbers[i]);
            }
        }
        return ms;
    }
}
