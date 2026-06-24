package codes;

import java.util.Arrays;

public class DividedArray {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
            .filter((a)->a%divisor==0)
            .sorted()
            .toArray();
        
        if(result.length == 0){
            return new int[]{-1};
        }
        
        return result;
    }
}
