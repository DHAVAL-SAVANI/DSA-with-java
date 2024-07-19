public class decToBin {
    public static void main(String args[]){
        int bin = decimalToBinary(8);
        System.out.println(bin);
    }
    public static int decimalToBinary(int dec){
        int bin = 0, i=0 , rem;
        while(dec>0){
            rem = dec%2;
            bin = bin + rem * (int)Math.pow(10,i);
            dec /= 2;
            i++;
        }
        return bin;
    }
}
