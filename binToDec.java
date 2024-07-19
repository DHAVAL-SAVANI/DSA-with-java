public class binToDec{
    public static void main(String args[]){
        System.out.println(binaryToDecimal(11));
    }
    public static int binaryToDecimal(int bin){
        int dec=0,i=0;
        while(bin!=0){
            dec = dec + ((bin%10) * (int)Math.pow(2,i));
            bin /= 10;
            i++;
        }
        return dec;
    }
}