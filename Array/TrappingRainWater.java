public class TrappingRainWater {
    public static void main(String args[]){
        int arr[] = new int[] {4,2,0,6,3,2,5};
        
        System.out.println(trappingRainWater(arr));
        
        System.out.println(trappingRainwater(arr));
    }

    public static int trappingRainwater(int numbers[]){ //---------time complexity O(n) , space 2n;
        int arrLeftmax[] = new int[numbers.length];
        int arrRightmax[] = new int[numbers.length];
        
        arrLeftmax[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            arrLeftmax[i] = Math.max(numbers[i],arrLeftmax[i-1]);
        }
        
        arrRightmax[arrRightmax.length-1] = numbers[numbers.length-1];
        for(int i=numbers.length-2; i>=0; i--){
            arrRightmax[i] = Math.max(numbers[i],arrRightmax[i+1]);
        }
        
        int tw=0;
        for(int i=0; i<numbers.length; i++){
            int wl = Math.min(arrLeftmax[i],arrRightmax[i]);
            tw += wl - numbers[i];
        }
        return tw;
    }

    public static int trappingRainWater(int numbers[]){ //-----------time Complexity O(n^2) , space 1;
        int wl=0; // water level
        
        int tw=0; // total water
        for(int k=1; k<numbers.length-1; k++){
           
            int lm=0; // left max boundry
            int rm=0; // right max boundry
            
            for(int i=k-1; i>=0; i--){
                if(numbers[i]>lm){
                    lm=numbers[i];
                }
            }
            // System.out.println("Left max for "+numbers[k]+" is "+lm);
            
            for(int j=k+1; j<numbers.length; j++){
                if(numbers[j]>rm){
                    rm = numbers[j];
                }
            }
            
            // System.out.println("Right max for "+numbers[k]+" is "+rm);
            
            wl=Math.min(lm,rm);
            // System.out.println("Water level = "+wl);
            
            if((wl-numbers[k])>0){
                tw += (wl - numbers[k]);
            }
            // System.out.println("Total Water = "+tw);
        }
        return tw;
    }
    
}